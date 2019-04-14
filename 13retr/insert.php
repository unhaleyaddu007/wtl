<?php


$cnt=mysqli_connect("localhost","root","qwerty");
mysqli_select_db($cnt,"practise");
$result=mysqli_query($cnt,"select * from student order by percent");
echo'<table>';
if(mysqli_num_rows($result)>0)
{
	while($row=mysqli_fetch_assoc($result))
		{
		echo"<tr><td>".$row["roll"]."</td><td>".$row["name"]."</td><td>".$row["class1"]."</td><td>".$row["dept"]."</td><td>".$row["percent"]."</td></tr>";
		}
}

echo '</table>';
?>
