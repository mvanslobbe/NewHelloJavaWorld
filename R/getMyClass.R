getMyClass <- function(contents){
   hjw <- .jnew("HelloJavaWorld") # create instance of HelloJavaWorld class
   out <- .jcall(hjw,"LMyClass;","getMyClass",contents)
   return(out)
}
