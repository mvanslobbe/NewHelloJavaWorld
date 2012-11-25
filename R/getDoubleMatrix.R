getDoubleMatrix <- function()
{
    hjw <- .jnew("HelloJavaWorld") # create instance of HelloJavaWorld class
    out <- .jcall(hjw, "[[D", "getDoubleMatrix") # invoke getDoubleMatrix method
    return(t(sapply(out,.jevalArray)))
}
