package ez.web

import org.springframework.http.ResponseEntity

fun <T> responseEntity(block: (ResponseEntity.BodyBuilder) -> T): ResponseEntity<T> {
  val builder = ResponseEntity.ok()
  return builder.body(block(builder))
}

fun responseEntityVoid(block: (ResponseEntity.BodyBuilder) -> Unit): ResponseEntity<Void> {
  return ResponseEntity.ok().also(block).body(null)
}