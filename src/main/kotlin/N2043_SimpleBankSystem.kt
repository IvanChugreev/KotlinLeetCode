class N2043_SimpleBankSystem {
    class Bank(val balance: LongArray) {

        private fun getAccountIndex(account: Int): Int? {
            if (account > balance.size) return null
            return account - 1
        }

        fun transfer(account1: Int, account2: Int, money: Long): Boolean {
            val indexOfAccount1 = getAccountIndex(account1) ?: return false
            val indexOfAccount2 = getAccountIndex(account2) ?: return false
            if (balance[indexOfAccount1] < money) return false
            balance[indexOfAccount1] -= money
            balance[indexOfAccount2] += money
            return true
        }

        fun deposit(account: Int, money: Long): Boolean {
            val accountIndex = getAccountIndex(account) ?: return false
            balance[accountIndex] += money
            return true
        }

        fun withdraw(account: Int, money: Long): Boolean {
            val accountIndex = getAccountIndex(account) ?: return false
            if (balance[accountIndex] < money) return false
            balance[accountIndex] -= money
            return true
        }

    }
}