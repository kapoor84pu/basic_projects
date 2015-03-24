<html>
<head>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>

<body>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			var list = ${msg};
			alert(list.nameString);
			$('#getJson').append(list.nameString);  
		});
	</script>
	
	<p id="getJson">hello</p>
	
</body>

</html>