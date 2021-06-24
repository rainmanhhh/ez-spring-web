package ez.web

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

fun HttpStatus.thr(errMsg: String? = null, cause: Throwable? = null): Nothing =
  throw ResponseStatusException(this, errMsg, cause)