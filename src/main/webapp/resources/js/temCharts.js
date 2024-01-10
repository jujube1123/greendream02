
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
		url:"/temCharts",
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
			const myChart = new Chart(
				document.getElementById("line-chart"), {
				type: 'line',
				data: {
				labels: timeList,
				datasets: [{
				        data: temList,
				        label: "온도",
				        borderColor: "#3e95cd",
				        fill: false
			          }
					]
				  },
				options: {
					plugins:{
					 	title: {
					 		display: true,
					 		text: '실시간 온도 측정 그래프'
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
						  		min: 15,
						  		max: 35,
						  			
						  		},
					  		x: {
					  			grid:{
							  		display: false
				  				}
				  			}
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