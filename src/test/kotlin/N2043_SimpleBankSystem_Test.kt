import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N2043_SimpleBankSystem_Test {

    @Test
    fun bank_Test1() {
        val bank = N2043_SimpleBankSystem.Bank(longArrayOf(10, 100, 20, 50, 30))
        val results = mutableListOf<Boolean>()
        results += bank.withdraw(3, 10)
        results += bank.transfer(5, 1, 20)
        results += bank.deposit(5, 20)
        results += bank.transfer(3, 4, 15)
        results += bank.withdraw(10, 50)
        assertThat(results).containsExactly(true, true, true, false, false)
    }

}