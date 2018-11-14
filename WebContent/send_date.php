<?php

  $baseURL = "http://192.168.100.39:8080/ccsv1/CcsProva?";
  
  foreach ($_GET as $key => $value) {
  	$baseURL = $baseURL . $key . "=" . $value . "&";
  }
  
  echo file_get_contents($baseURL);
  echo file_get_contents("test_data.json");
?>