package axel.model

import scala.concurrent.Future
import scala.scalajs.js

case class Response(
  statusCode: Int,
  statusMessage: String
)

/**
 * Transport defines basic functions for
 * sending HTTP request asynchronically.
 */
trait Transport {
  def send(): Future[Response]
}
