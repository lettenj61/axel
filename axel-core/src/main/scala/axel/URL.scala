package axel

import scala.scalajs.js

/**
 * Shared property for URL object in JavaScript.
 *
 * Implementation will be injected from DOM API in browser environment,
 * or URL module when in Node.js
 */
@js.native
abstract class URL extends js.Object {
  def origin: String = js.native
  var href: String = js.native
  var protocol: String = js.native
  var username: String = js.native
  var password: String = js.native
  var host: String = js.native
  var hostname: String = js.native
  var port: String = js.native
  var pathname: String = js.native
  var search: String = js.native
  var hash: String = js.native
}
