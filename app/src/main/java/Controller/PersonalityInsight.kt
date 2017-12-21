package Controller

import com.ibm.watson.developer_cloud.tone_analyzer.v3.ToneAnalyzer
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneInput
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneOptions


class PersonalityInsight
{
    fun GetInsight(text: String) : ToneAnalysis?
    {
        //Lite plan services are deleted after 30 days of inactivity.

        val n = ToneAnalyzer("2017-10-10","63985687-4445-4696-add0-f64fe9cf930d", "oJP6WV3Of8mf")

        val toneInput = ToneInput.Builder().text(text).build()
        val ops = ToneOptions.Builder().toneInput(toneInput).build()

        return n.tone(ops).execute()

    }

}