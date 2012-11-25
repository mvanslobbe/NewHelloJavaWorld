getString <- function(){
   hjw <- .jnew("HelloJavaWorld") # create instance of HelloJavaWorld class
   out <- .jcall(hjw, "S", "getString") # invoke getString method
   return(out)
}
