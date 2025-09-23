class N165_CompareVersionNumbers {
    fun compareVersion(version1: String, version2: String): Int {
        var index1 = 0
        var index2 = 0
        while (index1 < version1.length || index2 < version2.length) {
            var num1 = 0
            var num2 = 0
            while (index1 < version1.length && version1[index1] != '.') {
                num1 = num1 * 10 + (version1[index1++] - '0')
            }
            while (index2 < version2.length && version2[index2] != '.') {
                num2 = num2 * 10 + (version2[index2++] - '0')
            }
            if (num1 != num2) {
                return if (num1 < num2) -1 else 1
            }
            ++index1
            ++index2
        }
        return 0
    }
}