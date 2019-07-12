<?php 
	$servername = "localhost";
	$username = "root";
	$password = "";
	$dbname = "hr";
		  
	$conn = new mysqli($servername, $username, $password, $dbname);
	if ($conn->connect_error) {
		die("Connection failed: " . $conn->connect_error);
	} 
	
	$uid = $_POST['uid'];
	$pid = $_POST['passid'];
	
	$sql = "select * from login where userid='$uid' and password='$pid'";
		  
	$result = $conn->query($sql);
		  
	if($result->num_rows > 0){
			  echo "<h4>Information</h4>";
			  while($row=$result->fetch_assoc()){
				  echo "<p>User ID :".$row["userid"]."</p>";
				  echo "<p>Password :".$row["password"]."</p>";
	}
	}
	else
		echo "Invalid user id or password"
?>	
				  