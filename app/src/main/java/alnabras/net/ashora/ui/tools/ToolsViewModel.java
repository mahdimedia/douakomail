package alnabras.net.ashora.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToolsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ToolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("السّلامُ على وليّ الله وحبيبه\n" +
                "\n" +
                "السّلامُ على خليل الله ونجيبه\n" +
                "\n" +
                "السّلامُ على صفيّ الله وابْن صفيّه\n" +
                "\n" +
                "السّلامُ على الْحُسيْن الْمظْلُوم الشّهيد\n" +
                "\n" +
                "السّلامُ على اسير الْكُرُبات وقتيل الْعبرات\n" +
                "\n" +
                "اللّـهُمّ انّي اشْهدُ انّهُ وليُّك وابْنُ وليّك وصفيُّك وابْنُ صفيّك الْفائزُ بكرامتك، اكْرمْتهُ بالشّهادة وحبوْتهُ بالسّعادة، واجْتبيْتهُ بطيب الْولادة، وجعلْتهُ سيّداً من السادة، وقائداً من الْقادة، وذائداً منْ الْذادة، واعْطيْتهُ مواريث الاْنْبياء، وجعلْتهُ حُجّةً على خلْقك من الاْوْصياء، فاعْذر فى الدُّعاء ومنح النُّصْح، وبذل مُهْجتهُ فيك ليسْتنْقذ عبادك من الْجهالة وحيْرة الضّلالة، وقدْ توازر عليْه منْ غرّتْهُ الدُّنْيا، وباع حظّهُ بالاْرْذل الاْدْنى، وشرى آخرتهُ بالّثمن الاْوْكس، وتغطْرس وتردّى في هواهُ، واسْخطك واسْخط نبيّك، واطاع منْ عبادك اهْل الشّقاق والنّفاق وحملة الاْوْزار الْمُسْتوْجبين النّار، فجاهدهُمْ فيك صابراً مُحْتسباً حتّى سُفك في طاعتك دمُهُ واسْتُبيح حريمُهُ، اللّـهُمّ فالْعنْهُمْ لعْناً وبيلاً وعذّبْهُمْ عذاباً اليماً\n" +
                "\n" +
                "السّلامُ عليْك يا بْن رسُول الله\n" +
                "\n" +
                "لسّلامُ عليْك يا بْن سيّد الاْوْصياء\n" +
                "\n" +
                "اشْهدُ انّك امينُ الله وابْنُ امينه، عشْت سعيداً ومضيْت حميداً ومُتّ فقيداً مظْلُوماً شهيداً، واشْهدُ انّ الله مُنْجزٌ ما وعدك، ومُهْلكٌ منْ خذلك، ومُعذّبٌ منْ قتلك، واشْهدُ انّك وفيْت بعهْد الله وجاهدْت في سبيله حتّى اتياك الْيقينُ، فلعن اللهُ منْ قتلك، ولعن اللهُ منْ ظلمك، ولعن اللهُ اُمّةً سمعتْ بذلك فرضيتْ به\n" +
                "\n" +
                "اللّـهُمّ انّي اُشْهدُك انّي وليٌّ لمنْ والاهُ وعدُوٌّ لمنْ عاداهُ بابي انْت واُمّي يا بْن رسُول الله\n" +
                "\n" +
                "اشْهدُ انّك كُنْت نُوراً فى الاْصْلاب الشّامخة والاْرْحام الْمُطهّرة، لمْ تُنجّسْك الْجاهليّةُ بانْجاسها ولمْ تُلْبسْك الْمُدْلهمّاتُ منْ ثيابها\n" +
                "\n" +
                "واشْهدُ انّك منْ دعائم الدّين وارْكان الْمُسْلمين ومعْقل الْمُؤْمنين\n" +
                "\n" +
                "واشْهدُ انّك الاْمامُ الْبرُّ التّقيُّ الرّضيُّ الزّكيُّ الْهادي الْمهْديُّ\n" +
                "\n" +
                "واشْهدُ انّ الاْئمّة منْ وُلْدك كلمةُ التّقْوى واعْلامُ الْهُدى والْعُرْوةُ الْوُثْقى، والْحُجّةُ على اهْل الدُّنْيا\n" +
                "\n" +
                "واشْهدُ انّي بكُمْ مُؤْمنٌ وبايابكُمْ، مُوقنٌ بشرايع ديني وخواتيم عملي، وقلْبي لقلْبكُمْ سلْمٌ وامْري لامْركُمْ مُتّبعٌ ونُصْرتي لكُمْ مُعدّةٌ حتّى يأذن اللهُ لكُمْ، فمعكُمْ معكُمْ لا مع عدُوّكُمْ صلواتُ الله عليْكُمْ وعلى ارْواحكُمْ واجْسادكُمْ وشاهدكُمْ وغائبكُمْ وظاهركُمْ وباطنكُمْ آمين ربّ الْعالمين");
    }

    public LiveData<String> getText() {
        return mText;
    }
}