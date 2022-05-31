package string.DefangingAnIPAddress

object DefangingAnIPAddress {
    fun defangIPaddr(address: String): String = address.replace( "." , "[.]" )
}