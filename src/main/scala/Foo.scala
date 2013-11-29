import reactivemongo.api.collections.default.BSONCollection
import reactivemongo.api.MongoDriver
import reactivemongo.bson.BSONDocument
import scala.concurrent.ExecutionContext
import ExecutionContext.Implicits.global

object Foo {
  val driver = new MongoDriver
  val connection = driver.connection(List("localhost"))
  val db = connection.db("db")
  val works = db.collection[BSONCollection]("foo")
  val doesnt = db.collection("foo")


//
//  scala> :type Foo.works
//  reactivemongo.api.collections.default.BSONCollection
//
//  scala> :type Foo.doesnt
//  reactivemongo.api.collections.default.BSONCollection
}
