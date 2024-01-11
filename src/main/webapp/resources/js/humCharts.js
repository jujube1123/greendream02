
$(document).ready(function(){
	
	getHum();
	// 2초마다 자동 새로고침 실행
	//setTimeout("history.go();",60000);
});

function getHum(){
	// 온도 배열
	let humList = [];
	// 시간 배열
	let timeList = [];
	
	$.ajax({
		url:"/humCharts",
		type:"get",
		data:{tem:"", time:""},
		dataType:"json",
		contentType:"application/json",
		success:function(data){
			console.log(data)
			console.log(data[0].hdb)
			for (var i=0; i<data.length; i++){
				humList.push(data[i].hdb);
				timeList.push(data[i].dtim);
			}
			console.log(humList);
			console.log(timeList);
			// 그래프
			new Chart(document.getElementById("line-chart02"), {
				type: 'line',
				data: {
				labels: timeList,
				datasets: [{
				        data: humList,
				        label: "습도",
				        borderColor: "#E8D9FF",
				        // 그래프 선 안을 안 채움
				        fill: false,
				        // 그래프 선의 부드러움 조절. 낮을 수록 꺾인 그래프
				        tension: 0.4
			          }]
				  },
				options: {
					plugins:{
					 	title: {
					 		display: true,
					 		text: '실시간 습도 측정 그래프',
					 		font: {
					 			size: 20
					 		},
					 		color: '#F6F6F6',
					 	},
					    legend:{
					    	display: false,
					    }
					},
				  	animation:{
				  		duration: 0
				  		},
			  		 elements: {
						point: {
							radius: 0,
						}
			      	  },
				  	scales: {
					  	y: {
					  		min: 10,
					  		max: 60,
				  			grid:{
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
			  			}
			  		}			  	
				  }
				}); //그래프
			}, //success
			error:function(){
				console.log(data[0].hdb);		
				alert("실패");	
			}
		}) // ajax
	} // getTem