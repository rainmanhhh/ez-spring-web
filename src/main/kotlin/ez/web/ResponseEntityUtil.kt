package ez.web

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

fun <T>responseEntity(status: HttpStatus = HttpStatus.OK, body: () -> T): ResponseEntity<T> {
  return ResponseEntity.status(status).body(body())
}

fun responseEntity(status: HttpStatus = HttpStatus.OK): ResponseEntity<Void> {
  return ResponseEntity.status(status).body(null)
}