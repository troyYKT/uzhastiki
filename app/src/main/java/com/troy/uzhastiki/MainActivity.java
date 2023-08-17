package com.troy.uzhastiki;

import static androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String YANDEX_MOBILE_ADS_TAG = "YandexMobileAds";
    InterstitialAd mInterstitialAd;
    String AdUnitId = "R-M-2139998-1";
    boolean isLoaded=false;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    Dialog myDialog;
    boolean hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //Инициализация рекламы
        MobileAds.initialize(this, new InitializationListener() {
                @Override
                public void onInitializationCompleted() {
                    Log.d(YANDEX_MOBILE_ADS_TAG, "SDK initialized");
                }
            });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(AdUnitId);

        // Создание объекта таргетирования рекламы.
        final AdRequest adRequest = new AdRequest.Builder().build();

        // Регистрация слушателя для отслеживания событий, происходящих в рекламе.
        mInterstitialAd.setInterstitialAdEventListener(new InterstitialAdEventListener() {
            @Override
            public void onAdLoaded() {
               mInterstitialAd.show();
            }

            @Override
            public void onAdFailedToLoad(AdRequestError adRequestError) {
            }

            @Override
            public void onAdShown() {

            }

            @Override
            public void onAdDismissed() {

            }

            @Override
            public void onAdClicked() {

            }

            @Override
            public void onLeftApplication() {

            }

            @Override
            public void onReturnedToApplication() {

            }

            @Override
            public void onImpression(@Nullable ImpressionData impressionData) {

            }
        });

        // Загрузка объявления.
        mInterstitialAd.loadAd(adRequest);

        ArrayList<UzhastikItem> UzhastikItemsItems = new ArrayList<>();

        UzhastikItemsItems.add(new UzhastikItem(
                1, "Пальцы", loadTextFileFromAsset("palci.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                2, "Knocks1382.mkv", loadTextFileFromAsset("knocks.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                3, "Царапина", loadTextFileFromAsset("caparina.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                4, "Внука увидишь", loadTextFileFromAsset("vnukauvi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                5, "Бабушка", loadTextFileFromAsset("babushka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                6, "Деревня на кладбище", loadTextFileFromAsset("derevnyanakladbishe.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                7, "Гиблые топи", loadTextFileFromAsset("giblietopi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                8, "Странное нечто на даче", loadTextFileFromAsset("nechtonadache.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                9, "Неспящая", loadTextFileFromAsset("nespyashaya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                10, "Озёрные тайны", loadTextFileFromAsset("ozernietayni.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                11, "Отняла!", loadTextFileFromAsset("otnyala.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                12, "Странный мужик в доме ночью", loadTextFileFromAsset("stranniymuzhik.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                13, "Пацифист", loadTextFileFromAsset("pacifist.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                14, "Постираешь мою рубаху?", loadTextFileFromAsset("postiraeshrubashku.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                15, "Маршрутка", loadTextFileFromAsset("marshrutka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                16, "Огонь, вода и медные трубы или происки банника", loadTextFileFromAsset("ogonvoda.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                17, "Мама", loadTextFileFromAsset("mama.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                18, "Соседи", loadTextFileFromAsset("sosedi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                19, "Странная поездка", loadTextFileFromAsset("strannayapoezdka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                20, "Сон", loadTextFileFromAsset("son.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                21, "Пропажи", loadTextFileFromAsset("propazhi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                22, "Случай в деревне", loadTextFileFromAsset("sluchaivderevne.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                23, "Туман на дамбе", loadTextFileFromAsset("tumannadambe.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                24, "Чайник", loadTextFileFromAsset("chainik.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                25, "Странная девица", loadTextFileFromAsset("strannayadevica.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                26, "Коровка", loadTextFileFromAsset("korovka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                27, "Черти среди людей", loadTextFileFromAsset("chertisredi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                28, "Новая квартира", loadTextFileFromAsset("novayakvartira.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                29, "Разборки мертвецов", loadTextFileFromAsset("razborkimertvesov.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                30, "В котельной у деда", loadTextFileFromAsset("vkotelnoy.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                31, "Спасибо Деду Морозу", loadTextFileFromAsset("spasibodedu.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                32, "Дедуля", loadTextFileFromAsset("dedulya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                33, "Сбой в матрице", loadTextFileFromAsset("sboyvmatrise.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                34, "Человек в белом", loadTextFileFromAsset("chelovekvbelom.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                35, "Последний поцелуй", loadTextFileFromAsset("lastkiss.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                36, "Комната с дед-Морозами", loadTextFileFromAsset("roomwithdeds.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                37, "Ночь, луна, карета", loadTextFileFromAsset("nihgtmoon.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                38, "Архив из макулатуры", loadTextFileFromAsset("arhivismaku.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                39, "Призрак друга повстречался", loadTextFileFromAsset("ghostfriend.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                40, "Щеночек", loadTextFileFromAsset("chenok.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                41, "Шерсть и кости", loadTextFileFromAsset("sherstikosti.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                42, "Кавказский сон", loadTextFileFromAsset("kavkazson.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                43, "Не бойся мертвых, а бойся живых", loadTextFileFromAsset("neboysya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                44, "И лихо ушло тихо", loadTextFileFromAsset("iliho.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                45, "Кто гонял кур?", loadTextFileFromAsset("ktogonyal.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                46, "Мама в голубом платье", loadTextFileFromAsset("mamavgolubom.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                47, "Раз на раз не приходится...", loadTextFileFromAsset("raznaraz.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                48, "Ценитель женской красоты", loadTextFileFromAsset("senitel.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                49, "Простите меня!", loadTextFileFromAsset("sorry.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                50, "Зеркальные коридоры", loadTextFileFromAsset("mirror.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                51, "Пакет", loadTextFileFromAsset("paket.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                52, "Клад покойника", loadTextFileFromAsset("kladdead.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                53, "Совпадения или нет?", loadTextFileFromAsset("sovpad.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                54, "Как в нашей семье возвращаются покойные", loadTextFileFromAsset("kakvnashey.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                55, "Муравейник", loadTextFileFromAsset("muravey.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                56, "Городские легенды Мюнхена", loadTextFileFromAsset("munich.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                57, "Бабка, Леший и кастрюля", loadTextFileFromAsset("babkaleshiy.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                58, "Домовой в новом доме", loadTextFileFromAsset("domovoy.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                59, "Сладкий сон оборотня", loadTextFileFromAsset("sladkiyson.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                60, "Манечка", loadTextFileFromAsset("manechka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                61, "Аджан", loadTextFileFromAsset("adjan.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                62, "Дама с собачкой", loadTextFileFromAsset("damassobakoy.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                63, "Хозяюшка землянки", loadTextFileFromAsset("xozzeml.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                64, "Катя, возьми телефон...", loadTextFileFromAsset("katyavozmi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                65, "Тайский боксер и Северный Шаман", loadTextFileFromAsset("tayskiyboxer.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                66, "Миша", loadTextFileFromAsset("misha.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                67, "Песий язык", loadTextFileFromAsset("pesiyyazik.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                68, "Тётя Галя", loadTextFileFromAsset("tetyagalya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                69, "Как мы прогулялись по улице", loadTextFileFromAsset("kakmi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                70, "Когда сильно поверил в свои способности", loadTextFileFromAsset("kogdasilno.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                71, "Нагадала цыганка жену", loadTextFileFromAsset("nagadala.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                72, "Заглянул на секунду в будущее", loadTextFileFromAsset("zaglyanul.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                73, "Ночные загадки", loadTextFileFromAsset("nochniezagadki.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                74, "Платье изо льда", loadTextFileFromAsset("plateizolda.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                75, "Полтергейст не в розыске", loadTextFileFromAsset("poltergeist.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                76, "Спасибо Ангелу-Хранителю", loadTextFileFromAsset("spasiboangelu.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                77, "Кофеек из праха Ок", loadTextFileFromAsset("kofeekizpraxa.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                78, "Малые Мшары", loadTextFileFromAsset("maliemshari.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                79, "BoopyMine.ru", loadTextFileFromAsset("boopymine.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                80, "Деревня Бесихи", loadTextFileFromAsset("besixi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                81, "Исчезли оба", loadTextFileFromAsset("ischezlioba.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                82, "Свекруня", loadTextFileFromAsset("svekrunya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                83, "Деревня неживых", loadTextFileFromAsset("toplennaya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                84, "Кто-то бегает", loadTextFileFromAsset("ktotorun.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                85, "Алиса", loadTextFileFromAsset("alisa.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                86, "Саранча", loadTextFileFromAsset("sarancha.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                87, "Остался с покойницей", loadTextFileFromAsset("ostalsya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                88, "Наблюдая за нестрашным", loadTextFileFromAsset("nabludaya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                89, "Анчутка", loadTextFileFromAsset("anchutka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                90, "Товарняк", loadTextFileFromAsset("tovarnyak.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                91, "Тайна тела", loadTextFileFromAsset("taynatela.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                92, "Жуть", loadTextFileFromAsset("zhut.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                93, "\"Подарок\" маньяка-убийцы", loadTextFileFromAsset("podarok.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                94, "Зря мёртвую невесту пригласил", loadTextFileFromAsset("deadnevesta.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                95, "Нежданные гости", loadTextFileFromAsset("nezdguest.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                96, "ЧТО УВИДЕЛА БАБУШКА?", loadTextFileFromAsset("chtouvidela.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                97, "Воскрешение", loadTextFileFromAsset("voskreshenie.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                98, "Мертвец кое-что объяснил", loadTextFileFromAsset("mertves.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                99, "Легенда о Буратино", loadTextFileFromAsset("buratino.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                100, "Дядя Ленин", loadTextFileFromAsset("lenin.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                101, "Цокольный этаж", loadTextFileFromAsset("cokol.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                102, "Дочка любимой покойницы", loadTextFileFromAsset("dochka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                103, "Подождите немного - и я сгину!", loadTextFileFromAsset("wait.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                104, "Пропавший самолет", loadTextFileFromAsset("lostplain.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                105, "Куда пропал ключ?", loadTextFileFromAsset("kudapropalkey.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                106, "Мост висельников", loadTextFileFromAsset("visbridge.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                107, "Что со мной", loadTextFileFromAsset("chtosomnoy.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                108, "Бегущая строка", loadTextFileFromAsset("stroka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                109, "Вопрос веры", loadTextFileFromAsset("voprosveri.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                110, "Следят за нами тайно", loadTextFileFromAsset("sledyat.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                111, "Не гуляйте по ночам", loadTextFileFromAsset("negulyayte.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                112, "Как стучит Душехлёб", loadTextFileFromAsset("kakstuchit.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                113, "Это не та Вселенная!", loadTextFileFromAsset("netavsel.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                114, "Домовой \"Дикси\"?", loadTextFileFromAsset("diksi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                115, "Отверстия", loadTextFileFromAsset("otvers.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                116, "Кап… кап… кап...", loadTextFileFromAsset("kapkap.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                117, "Скипидар", loadTextFileFromAsset("skipidar.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                118, "Это был сон?", loadTextFileFromAsset("itwasdream.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                119, "Человек рассвета", loadTextFileFromAsset("chelrass.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                120, "Лариска", loadTextFileFromAsset("lariska.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                121, "А матрёшка непростая…", loadTextFileFromAsset("matreshka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                122, "Душехлёб", loadTextFileFromAsset("dushehleb.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                123, "Простые правила", loadTextFileFromAsset("prosprav.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                124, "Двери ночью закрывай", loadTextFileFromAsset("dverisakr.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                125, "Третья комната", loadTextFileFromAsset("thirdroom.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                126, "За деревянным заборчиком...", loadTextFileFromAsset("zazabor.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                127, "Бомжик", loadTextFileFromAsset("bomzik.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                128, "Поместье генерала Эпила", loadTextFileFromAsset("epila.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                129, "Снеговичок", loadTextFileFromAsset("snegovik.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                130, "Подарок из ниоткуда", loadTextFileFromAsset("podarokizniot.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                131, "Царь лесов", loadTextFileFromAsset("tsarlesov.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                132, "Случай в нашей бане", loadTextFileFromAsset("banya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                133, "I love you", loadTextFileFromAsset("iloveyou.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                134, "Шатун", loadTextFileFromAsset("shatun.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                135, "Шутка", loadTextFileFromAsset("shutka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                136, "Спокойной ночи, страшная рожа!", loadTextFileFromAsset("goodnight.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                137, "Катька", loadTextFileFromAsset("katka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                138, "Ужасы бабки Нюры", loadTextFileFromAsset("nyura.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                139, "Кенотаф", loadTextFileFromAsset("kenotaf.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                140, "Пролиферация", loadTextFileFromAsset("prolif.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                141, "Убить Упыря", loadTextFileFromAsset("ubitupirya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                142, "Байки от дедушки-следователя", loadTextFileFromAsset("baykideda.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                143, "Друг по переписке", loadTextFileFromAsset("drugpopere.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                144, "Пойдем в подвал", loadTextFileFromAsset("gopodval.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                145, "Она ела", loadTextFileFromAsset("sheeat.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                146, "Цикл ФОТУРО", loadTextFileFromAsset("foturo.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                147, "Самая странная запись видеонаблюдения", loadTextFileFromAsset("moststrange.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                148, "Окно наружу", loadTextFileFromAsset("oknonaruzu.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                149, "Мшец", loadTextFileFromAsset("mzes.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                150, "Квартира номер 48", loadTextFileFromAsset("kvartira48.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                151, "Клиника для душевнобольных", loadTextFileFromAsset("klinika.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                152, "Новые тени", loadTextFileFromAsset("newshadow.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                153, "Поисково-спасательная служба", loadTextFileFromAsset("pss.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                154, "Таймеры", loadTextFileFromAsset("taymer.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                155, "Паразитизм", loadTextFileFromAsset("parazitizm.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                156, "Midnight Mover", loadTextFileFromAsset("mover.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                157, "Прятки с фонариком", loadTextFileFromAsset("pryatki.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                158, "Пап, а кто стучит за стенкой?", loadTextFileFromAsset("ktostuchit.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                159, "Курочка, открой дверь", loadTextFileFromAsset("kurochka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                160, "У меня нет брата", loadTextFileFromAsset("notbro.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                161, "Окна домов", loadTextFileFromAsset("okna.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                162, "Спички", loadTextFileFromAsset("spichki.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                163, "Горка была страшной", loadTextFileFromAsset("gorka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                164, "Болотина", loadTextFileFromAsset("bolotina.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                165, "Мой плот", loadTextFileFromAsset("plot.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                166, "Истории из детства", loadTextFileFromAsset("storykid.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                167, "Полная судьба", loadTextFileFromAsset("polnaya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                168, "Таёжная опасность", loadTextFileFromAsset("tayga.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                169, "Рыжая", loadTextFileFromAsset("ryzhaya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                170, "Как якут был нечистью", loadTextFileFromAsset("nechist.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                171, "Чучуна", loadTextFileFromAsset("chuchuna.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                172, "Ужас в доме отшельника", loadTextFileFromAsset("uzhasvdome.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                173, "Кони", loadTextFileFromAsset("koni.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                174, "Последний", loadTextFileFromAsset("last.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                175, "Абасы меня не уважает", loadTextFileFromAsset("abasi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                176, "Соревнование", loadTextFileFromAsset("sorevn.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                177, "Бэриэччит", loadTextFileFromAsset("beret.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                178, "Летняя стоянка", loadTextFileFromAsset("stoyanka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                179, "Ночная девушка", loadTextFileFromAsset("nochnaya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                180, "Шепчущие голоса", loadTextFileFromAsset("golosa.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                181, "Сердцеед", loadTextFileFromAsset("serdseed.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                182, "Стукач", loadTextFileFromAsset("stuchach.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                183, "Фаза ходячего трупа", loadTextFileFromAsset("phaza.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                184, "Королевский гвардеец", loadTextFileFromAsset("gvardees.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                185, "Веерное отключение", loadTextFileFromAsset("veernoe.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                186, "Вернуть отправителю", loadTextFileFromAsset("vernut.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                187, "Уоллмарт", loadTextFileFromAsset("wallmart.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                188, "Богемский инцидент", loadTextFileFromAsset("bogem.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                189, "Связь", loadTextFileFromAsset("svyaz.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                190, "Глаз", loadTextFileFromAsset("glaz.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                191, "Божественный эксперимент", loadTextFileFromAsset("exper.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                192, "Нянечка", loadTextFileFromAsset("nyanechka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                193, "Последний день Картерс Петролеум", loadTextFileFromAsset("karters.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                194, "Время для сказок", loadTextFileFromAsset("vremyadlya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                195, "Карта памяти заполнена", loadTextFileFromAsset("kartapamyati.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                196, "Сапожок", loadTextFileFromAsset("sapog.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                197, "Паразит", loadTextFileFromAsset("parazit.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                198, "Интернет-опрос", loadTextFileFromAsset("opros.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                199, "Дом там, где сердце", loadTextFileFromAsset("domtam.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                200, "Третий родитель", loadTextFileFromAsset("tretiyroditel.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                201, "Номера сотовых", loadTextFileFromAsset("nomera.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                202, "Иннерфейс", loadTextFileFromAsset("innerfeis.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                203, "Сега МегаДрайв", loadTextFileFromAsset("sega.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                204, "И ныне и присно", loadTextFileFromAsset("inine.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                205, "Чудовища", loadTextFileFromAsset("chudovisha.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                206, "Сортир дьявола", loadTextFileFromAsset("sortir.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                207, "Перед рассветом", loadTextFileFromAsset("peredrass.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                208, "После дождя", loadTextFileFromAsset("posledozhdya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                209, "Человеческие люди", loadTextFileFromAsset("lyudi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                210, "Иди всё время вниз", loadTextFileFromAsset("idivniz.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                211, "Морская фигура, замри", loadTextFileFromAsset("figurazamri.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                212, "Фрагменты", loadTextFileFromAsset("fragment.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                213, "Стафалланец", loadTextFileFromAsset("stafallanets.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                214, "Долгая дорога назад", loadTextFileFromAsset("doroganazad.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                215, "Пурга", loadTextFileFromAsset("purga.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                216, "Илюха", loadTextFileFromAsset("ilyuxa.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                217, "Борраска", loadTextFileFromAsset("borraska.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                218, "Земля медузы", loadTextFileFromAsset("zemlyameduzy.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                219, "Петля", loadTextFileFromAsset("petlya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                220, "Быть гладу и мору", loadTextFileFromAsset("gladuimoru.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                221, "Деменция", loadTextFileFromAsset("demen.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                222, "Алёнка", loadTextFileFromAsset("alenka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                223, "Саша Смирнов и Подземный Приют", loadTextFileFromAsset("smirnov.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                224, "Янкылма", loadTextFileFromAsset("yankilma.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                225, "Конверт", loadTextFileFromAsset("konvert.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                226, "Хвоя", loadTextFileFromAsset("xvoya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                227, "Грибница", loadTextFileFromAsset("gribnisa.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                228, "Чрево", loadTextFileFromAsset("chrevo.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                229, "Вайолет", loadTextFileFromAsset("violet.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                230, "Мрачные истории рыбацкого села", loadTextFileFromAsset("istoriisela.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                231, "Все мы здесь друзья", loadTextFileFromAsset("vsedruzya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                232, "Блэкаут", loadTextFileFromAsset("blackout.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                233, "Лошадиная голова", loadTextFileFromAsset("loshadgolova.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                234, "Катись, помидорка!", loadTextFileFromAsset("pomidorka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                235, "Не выключай телевизор", loadTextFileFromAsset("nevikl.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                236, "Руководство по куклицам", loadTextFileFromAsset("kuklitsa.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                237, "Не подавать виду", loadTextFileFromAsset("nepodavay.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                238, "Собери кусочки", loadTextFileFromAsset("soberikuski.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                239, "Давай поцелуемся", loadTextFileFromAsset("dabayposeluemsya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                240, "Мама", loadTextFileFromAsset("mother.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                241, "Настоящие люди", loadTextFileFromAsset("nastoyashiyelyudi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                242, "Внутри меня шумят деревья", loadTextFileFromAsset("vnutrimenya.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                243, "Буквы", loadTextFileFromAsset("bukvi.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                244, "Сказка со счастливым концом", loadTextFileFromAsset("skazka.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                245, "Друг детства", loadTextFileFromAsset("drugdetstva.txt")));
        UzhastikItemsItems.add(new UzhastikItem(
                246, "Записочки", loadTextFileFromAsset("zapisochki.txt")));













        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new UzhastikAdapter(UzhastikItemsItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        myDialog = new Dialog(this);
        myDialog.setContentView(R.layout.dialog_main);

        Window window = myDialog.getWindow();
        WindowManager.LayoutParams wlp = window.getAttributes();
        wlp.gravity = Gravity.TOP| Gravity.END;
        wlp.y = 100;
        wlp.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setAttributes(wlp);

        CheckBox checkBox = myDialog.findViewById(R.id.checkBox);

        SharedPreferences checkPref = this.getSharedPreferences("hide", MODE_PRIVATE);
        SharedPreferences.Editor checkEdit = checkPref.edit();
        hide = checkPref.getBoolean("checkbox",false);

        if (hide){
            checkBox.setChecked(true);
            checkEdit.putBoolean("checkbox",true);
            checkEdit.apply();
        }else {
            checkBox.setChecked(false);
            checkEdit.putBoolean("checkbox",false);
            checkEdit.apply();
        }

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    checkEdit.putBoolean("checkbox",true);
                    checkEdit.apply();
                    recreate();
                }else {
                    checkEdit.putBoolean("checkbox",false);
                    checkEdit.apply();
                    recreate();
                }
            }
        });
    }

    public void storyBtn(View view) {
        mInterstitialAd.show();
    }

    public void onResume() {
        adapter.setStateRestorationPolicy(PREVENT_WHEN_EMPTY);
        super.onResume();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        myDialog.show();
        return super.onOptionsItemSelected(item);
    }
    public String loadTextFileFromAsset(String path) {
        String content = null;
        try {

            InputStream is = this.getAssets().open(path);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            content = new String(buffer,"UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return content;
    }
}


