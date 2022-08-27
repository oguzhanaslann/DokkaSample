package com.oguzhanaslann.dokkasample

data class Product(
    val id : String,
    val name : String,
    val description : String,
    val producer : Producer
) {

    /**
     *  @return producer's address
     * */
    fun producerAddress() = producer.address
}
