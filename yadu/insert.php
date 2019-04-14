<?php

$name =$_POST["name"];
$roll =$_POST["roll"];
$class1 =$_POST["class"];
$dept =$_POST["dept"];
$percent =$_POST["percent"];





$cnt=mysqli_connect("localhost","root","qwerty");
mysqli_select_db($cnt,"practise");
mysqli_query($cnt,"insert into student values('$roll','$name','$class1','$dept','$percent');");


$result=sqli_query($cnt,"select * from student order by percent");
echo"<table>";
if(mysqli_num_rows($result)>0)
{
	while($row=mysqli_fetch_assoc($result))
		{
		echo"<tr><td>$row['roll']</td><td>$row['name']</td><td>$row['class1']</td><td>$row['dept']</td><td>$row['percent']</td></tr>";
		}
}
else{
echo "no data";
}
?>
