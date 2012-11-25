getDoubleVector <- function()
{
    hjw <- .jnew("HelloJavaWorld") # create instance of HelloJavaWorld class
    out <- .jcall(hjw, "[D", "getDoubleVector") # invoke getDoubleVector method
    return(out)
}
