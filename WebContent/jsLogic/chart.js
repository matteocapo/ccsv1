/**
 * chart js 
 */
var popCanvas = document.getElementById("popChart");
var popCanvas = $("#popChart");
var popCanvas = document.getElementById("popChart").getContext("2d");
var barChart = new Chart(popCanvas, {
	  type: 'bar',
	  data:{
	    labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
	    datasets: [{
	    	label: 'P.P.M Average',
	    	data: [1379302771, 1281935911, 326625791, 260580739, 207353391, 204924861, 190632261],
	    	backgroundColor: [
	        'rgba(255, 99, 132, 0.6)',
	        'rgba(54, 162, 235, 0.6)',
	        'rgba(255, 206, 86, 0.6)',
	        'rgba(75, 192, 192, 0.6)',
	        'rgba(153, 102, 255, 0.6)',
	        'rgba(255, 159, 64, 0.6)',
	        'rgba(255, 99, 132, 0.6)',
	        'rgba(54, 162, 235, 0.6)'
	        ]
	    }]

	  }
	});

