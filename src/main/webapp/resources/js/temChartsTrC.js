
$(document).ready(function(){
	
	getTem();
	// 2초마다 자동 새로고침 실행
	//setTimeout("history.go();",60000);
});



function getTem(){
	// 온도 배열
	let temList = [];
	// 시간 배열
	let timeList = [];
	
	$.ajax({
		url:"/temChartsTrC",
		type:"get",
		data:{tem:"", time:""},
		dataType:"json",
		contentType:"application/json",
		success:function(data){
			console.log(data)
			console.log(data[0].tdb)
			for (var i=0; i<data.length; i++){
				temList.push(data[i].tdb);
				timeList.push(data[i].dtim);
			}
			console.log(temList);
			console.log(timeList);
			
			// 그래프
			var ctx = document.getElementById("line-chart");
			var myChart = new Chart(ctx, {
				type: 'line',
				data: {
				labels: timeList,
				datasets: [{
			        data: temList,
			        label: "온도",
			        borderColor: "#FAECC5",
			        fill: false,
			        tension: 0.4
				}]
				},
				options: {
					plugins:{
					 	title: {
					 		display: true,
					 		text: '실시간 온도 측정 그래프',
					 		font: {
					 			size: 20
					 		},
					 		color: '#F6F6F6'
					    },
					    legend:{
					    	display: false,
					    },
					},
				    tooltips: {
/*						mode: 'index',
					    intersect: false,*/
				    	enabled: false
				    },
					hover: {
						animationDuration: 0
					},
				  	animation:{
				  		duration: 1,
				  		onComplete: function () {
							var chartInstance = this.chart,
								ctx = chartInstance.ctx;
							ctx.font = Chart.helpers.fontString(Chart.defaults.global.defaultFontSize, Chart.defaults.global.defaultFontStyle, Chart.defaults.global.defaultFontFamily);
							ctx.fillStyle = 'purple';
							ctx.textAlign = 'center';
							ctx.textBaseline = 'bottom';

							this.data.datasets.forEach(function (dataset, i) {
								var meta = chartInstance.controller.getDatasetMeta(i);
								meta.data.forEach(function (bar, index) {
									var data = dataset.data[index];							
									ctx.fillText(data, bar._model.x, bar._model.y - 5);
								});
							});
						}
				  		},
			  		 elements: {
						point: {
							radius: 0,
						}
			      	  },
				  	scales: {
					  	y: {
					  		min: 20,
					  		max: 35,
				  			grid: {
						  		display: false
			  				},
					  		ticks:{
					  			color: '#F6F6F6'
					  		}
					  	},
				  		x: {
				  			grid:{
						  		display: false
			  				},
					  		ticks:{
					  			color: '#F6F6F6'
					  		}
			  			},
				  		}
					}
				}); //그래프
			}, //success
			error:function(){
				console.log(data[0].tdb);		
				alert("실패");	
			}
		}) // ajax
	} // getTem