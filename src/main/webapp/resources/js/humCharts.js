
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
				        borderColor: "#3e95cd",
				        fill: false
			          }
					]
				  },
				options: {
					plugins:{
					 	title: {
					 		display: true,
					 		text: '실시간 습도 측정 그래프'
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
					  		min: 20,
					  		max: 50,
					  			
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
				console.log(data[0].hdb);		
				alert("실패");	
			}
		}) // ajax
	} // getTem