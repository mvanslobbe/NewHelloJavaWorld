concatString <- function(a,b){
   hjw <- .jnew("HelloJavaWorld") # create instance of HelloJavaWorld class
   out <- .jcall(hjw, "S", "concatString",a,b) # invoke concatString method
   return(out)
}
