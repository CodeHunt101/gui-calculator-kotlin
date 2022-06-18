sealed class Operator(val x: Long) {
    abstract fun calculate(y: Long): Long

    class Add(x: Long) : Operator(x) {
        override fun calculate(y: Long) = x + y
    }

    class Sub(x: Long) : Operator(x) {
        override fun calculate(y: Long) = x - y
    }

    class Mul(x: Long) : Operator(x) {
        override fun calculate(y: Long) = x * y
    }

    class Div(x: Long) : Operator(x) {
        override fun calculate(y: Long) = x / y
    }
}