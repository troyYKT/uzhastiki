package com.troy.uzhastiki;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        ArrayList<UzhastikItem> UzhastikItemsItems = new ArrayList<>();

        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_77_TITLE, Utils.STORY_77,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_78_TITLE, Utils.STORY_78,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_79_TITLE, Utils.STORY_79,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_80_TITLE, Utils.STORY_80,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_81_TITLE, Utils.STORY_81,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_82_TITLE, Utils.STORY_82,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_83_TITLE, Utils.STORY_83,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_84_TITLE, Utils.STORY_84,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_85_TITLE, Utils.STORY_85,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_86_TITLE, Utils.STORY_86,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_87_TITLE, Utils.STORY_87,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_88_TITLE, Utils.STORY_88,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_89_TITLE, Utils.STORY_89,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_90_TITLE, Utils.STORY_90,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_91_TITLE, Utils.STORY_91,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_92_TITLE, Utils.STORY_92,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_93_TITLE, Utils.STORY_93,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_94_TITLE, Utils.STORY_94,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_95_TITLE, Utils.STORY_95,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_96_TITLE, Utils.STORY_96,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_97_TITLE, Utils.STORY_97,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_98_TITLE, Utils.STORY_98,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_99_TITLE, Utils.STORY_99,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_100_TITLE, Utils.STORY_100,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_101_TITLE, Utils.STORY_101,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_102_TITLE, Utils.STORY_102,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_103_TITLE, Utils.STORY_103,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_104_TITLE, Utils.STORY_104,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_105_TITLE, Utils.STORY_105,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_106_TITLE, Utils.STORY_106,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_107_TITLE, Utils.STORY_107,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_108_TITLE, Utils.STORY_108,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_109_TITLE, Utils.STORY_109,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_111_TITLE, Utils.STORY_111,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_112_TITLE, Utils.STORY_112,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_113_TITLE, Utils.STORY_113,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_114_TITLE, Utils.STORY_114,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_115_TITLE, Utils.STORY_115,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_116_TITLE, Utils.STORY_116,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_117_TITLE, Utils.STORY_117,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_118_TITLE, Utils.STORY_118,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_119_TITLE, Utils.STORY_119,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_120_TITLE, Utils.STORY_120,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_121_TITLE, Utils.STORY_121,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_122_TITLE, Utils.STORY_122,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_123_TITLE, Utils.STORY_123,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_124_TITLE, Utils.STORY_124,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_125_TITLE, Utils.STORY_125,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_126_TITLE, Utils.STORY_126,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_127_TITLE, Utils.STORY_127,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_128_TITLE, Utils.STORY_128,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_129_TITLE, Utils.STORY_129,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_130_TITLE, Utils.STORY_130,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_131_TITLE, Utils.STORY_131,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_132_TITLE, Utils.STORY_132,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_133_TITLE, Utils.STORY_133,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_134_TITLE, Utils.STORY_134,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_135_TITLE, Utils.STORY_135,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_136_TITLE, Utils.STORY_136,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_137_TITLE, Utils.STORY_137,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_138_TITLE, Utils.STORY_138,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_139_TITLE, Utils.STORY_139,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_140_TITLE, Utils.STORY_140,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_141_TITLE, Utils.STORY_141,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_142_TITLE, Utils.STORY_142,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_143_TITLE, Utils.STORY_143,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_144_TITLE, Utils.STORY_144,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_145_TITLE, Utils.STORY_145,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_146_TITLE, Utils.STORY_146,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_147_TITLE, Utils.STORY_147,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_148_TITLE, Utils.STORY_148,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_149_TITLE, Utils.STORY_149,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_150_TITLE, Utils.STORY_150,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_151_TITLE, Utils.STORY_151,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_152_TITLE, Utils.STORY_152,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_153_TITLE, Utils.STORY_153,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_154_TITLE, Utils.STORY_154,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_155_TITLE, Utils.STORY_155,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_156_TITLE, Utils.STORY_156,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_157_TITLE, Utils.STORY_157,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_158_TITLE, Utils.STORY_158,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_159_TITLE, Utils.STORY_159,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_160_TITLE, Utils.STORY_160,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_161_TITLE, Utils.STORY_161,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_162_TITLE, Utils.STORY_162,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_163_TITLE, Utils.STORY_163,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_164_TITLE, Utils.STORY_164,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_165_TITLE, Utils.STORY_165,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_166_TITLE, Utils.STORY_166,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_167_TITLE, Utils.STORY_167,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_168_TITLE, Utils.STORY_168,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_169_TITLE, Utils.STORY_169,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_170_TITLE, Utils.STORY_170,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_171_TITLE, Utils.STORY_171,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_172_TITLE, Utils.STORY_172,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_173_TITLE, Utils.STORY_173,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_174_TITLE, Utils.STORY_174,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_175_TITLE, Utils.STORY_175,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_176_TITLE, Utils.STORY_176,false));
        UzhastikItemsItems.add(new UzhastikItem(
                Utils.STORY_177_TITLE, Utils.STORY_177,false));




        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new UzhastikAdapter(UzhastikItemsItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}

