package axel.model

import scala.concurrent.Future
import scala.scalajs.js

import axel.RequestFactory

/**
 * Model for incoming message from server.
 * Axel wraps any JavaScript native response data into this object.
 */
case class Response(
  statusCode: Int,
  statusMessage: String
)

/**
 * Transport defines basic functions for sending HTTP request asynchronically.
 */
trait Transport {
  def factory: RequestFactory
  def send(): Future[Response]
}

/**
 * Actual HTTP request client responsible for start sending requests
 * via underlying `factory` which varies by JavaScript runtime platform
 */
case class Request()(implicit val factory: RequestFactory) extends Transport {
  def send(): Future[Response] = ???
}
