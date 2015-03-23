<html>
	<!-- <head>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				receiveJson();
			});
			
			function receiveJson(){
				$.ajax({
					url: "/hello",
					type: 'GET',
					success:function(data){
						$("#jsonId").html(data);
					},
					error:function(data){
						alert("error : " + data);
					}
				});
			}
		</script>
	
	</head> -->
	
	<body>
	<%response.setContentType("application/json"); %>
	<button type="button" id="jsonId">Click Me</button>
	</body>
	
</html>