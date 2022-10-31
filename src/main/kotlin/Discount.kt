val FIRST_LEVEL_DISCOUNT = 100_00 //(копеек)
val SECOND_LEVEL_DISCOUNT = 5 //(%)
val REGULAR_CUSTOMER_DISCOUNT = 1  //(%)

fun main() {
    val isRegularCustomer0 = true
    val amount0 = 500_00 //(копеек)

    val isRegularCustomer1 = false
    val amount1 = 5000_00 //(копеек)

    val isRegularCustomer2 = true
    val amount2 = 15000_00 //(копеек)

    println(calculateDiscount(amount0, isRegularCustomer0) / 100)
    println(calculateDiscount(amount1, isRegularCustomer1) / 100)
    println(calculateDiscount(amount2, isRegularCustomer2) / 100)

}

fun calculateDiscount(amount: Int, isRegularCustomer: Boolean): Int {
    var payment: Int = amount
    if (amount > 1000_00) { //  скидка в зависимости от суммы покупки
        payment = if (amount > 10000_00) {
            amount * (100 - SECOND_LEVEL_DISCOUNT) / 100
        } else amount - FIRST_LEVEL_DISCOUNT
    }
    if (isRegularCustomer) //   скидка постоянного покупателя
        payment = payment * (100 - REGULAR_CUSTOMER_DISCOUNT) / 100
    return payment

}