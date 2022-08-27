package com.oguzhanaslann.dokkasample

data class Producer(
    val id :String,
    val name : String,
    val address : String
) {
    /**
     *  @return name and address in a single string
     *
     * */
    fun getNameWithAddress() = "Name : $name, address $address"
}
