name := "idea-inference-nothing"

scalaVersion := "2.10.2"

libraryDependencies <++= (scalaVersion) { scalaVersion => 
Seq(
  "org.reactivemongo" %% "reactivemongo" % "0.9"
)}