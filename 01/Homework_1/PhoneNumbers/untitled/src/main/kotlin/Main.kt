fun main() {

    var newPhoneNumber = readln()
    var phoneNumber1 = readln()
    var phoneNumber2 = readln()
    var phoneNumber3 = readln()

    val mutableList = ArrayList<String>()
    mutableList.add(newPhoneNumber)
    mutableList.add(phoneNumber1)
    mutableList.add(phoneNumber2)
    mutableList.add(phoneNumber3)
    var answer = ""
    for (i in 0..3) {
        mutableList[i] = mutableList[i].replace("-","")
            .replace("(", "").replace(")", "")
        if (mutableList[i].startsWith('8')) {
            mutableList[i] = mutableList[i].substring(1)
        } else if (mutableList[i].startsWith("+7")) {
            mutableList[i] = mutableList[i].substring(2)
        }
        if ( mutableList[i].startsWith("495") &&
            (mutableList[i].length - 3 == mutableList[0].length) ) {
            mutableList[i].drop(3)
        } else if ( mutableList[0].startsWith("495") &&
            (mutableList[0].length - 3 == mutableList[i].length) ) {
            mutableList[i] = "495" + mutableList[i]
        }
    }

    for (i in 1..3) {
        answer += if (mutableList[i] == mutableList[0]) {
            "YES\n"
        } else {
            "NO\n"
        }
    }
    println(answer)
}