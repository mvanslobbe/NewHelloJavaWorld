getOne <- function()
{
    hjw <- .jnew("HelloJavaWorld") # create instance of HelloJavaWorld class
    out <- .jcall(hjw, "I", "getOne") # invoke getHello method
    return(out)
}
