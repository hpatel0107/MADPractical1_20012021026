fun main(){
    print("Enter Month Number:")
    val a= readLine()!!.toInt()
    println(
        when (a){
            1-> {"January"}
            2->{"february"}
            3->{"march"}
            4->{"april"}
            5->{"may"}
            6->{"june"}
            7->{"july"}
            8->{"august"}
            9->{"september"}
            10->{"october"}
            11->{"november"}
            12->{"december"}
            else->{"Enter the proper number"}
        }
    )

}