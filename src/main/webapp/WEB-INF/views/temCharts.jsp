<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 실시간 온도 그래프 </title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/chart.js@3.0.0/dist/chart.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	getTem();
	
	// Register the plugin to all charts:
	Chart.register(ChartDataLabels);
	
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
				plugins: [ChartDataLabels],
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
					plugins: {
						legend: {
							display: false,
						},
					},
				 	title: {
				 		display: true,
				 		text: '실시간 온도 측정 그래프'
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
		  				x: {
		  					display: false
		  				},
		  				y: {
		  					display: false
		  				}
			  		},	
			        datalabels: { // datalables 플러그인 세팅
			            formatter: function (value, context) {
			              var idx = context.dataIndex; // 각 데이터 인덱스

			              // 출력 텍스트
			              return context.chart.data.labels[idx] + value + '%';
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
</script>
</head>
<body>
<div>
<canvas id="line-chart" width="150" height="100"></canvas>
</div>
</body>
</html>