package ez.web

import org.springframework.http.ResponseEntity

@Suppress("unused")
fun <T> responseEntity(block: (ResponseEntity.BodyBuilder) -> T): ResponseEntity<T> {
  val builder = ResponseEntity.ok()
  return builder.body(block(builder))
}

@Suppress("unused")
fun responseEntityVoid(block: (ResponseEntity.BodyBuilder) -> Unit): ResponseEntity<Void> {
  return ResponseEntity.ok().also(block).body(null)
}