<?php
$name =$_POST["name"];
$roll =$_POST["roll"];
$class1 =$_POST["class"];
$dept =$_POST["dept"];
$percent =$_POST["percent"];
echo "name:".$name;
$cnt=mysqli_connect("localhost","root","qwerty");
mysqli_select_db($cnt,"practise");
mysqli_query($cnt,"insert into student values('$roll','$name','$class1','$dept','$percent');");
mysqli_close($cnt);
?>
