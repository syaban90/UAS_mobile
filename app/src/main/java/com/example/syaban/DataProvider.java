package com.example.syaban;

import android.content.Context;

import com.example.syaban.model.Hantu;
import com.example.syaban.model.Hewan;
import com.example.syaban.model.Kucing;
import com.example.syaban.model.Ular;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.brithis_shorthair), ctx.getString(R.string.brithis_asal),
                ctx.getString(R.string.britis_deskripsi), R.drawable.british_shorthair_biru));

        kucings.add(new Kucing(ctx.getString(R.string.mine_coon), ctx.getString(R.string.mine_asal),
                ctx.getString(R.string.mine_deskripsi), R.drawable.kucing_mine_coon));

        kucings.add(new Kucing(ctx.getString(R.string.siam),ctx.getString(R.string.siam_asal),ctx.getString
                (R.string.siam_deskripsi),R.drawable.kucing_siam));
        return kucings;
    }

    private static List<Hantu> initDataHantu(Context ctx) {
        List<Hantu> hantus = new ArrayList<>();

        hantus.add(new Hantu(ctx.getString(R.string.celepuk),ctx.getString(R.string.cepluk_asal),
                ctx.getString(R.string.cepluk_deskripsi),R.drawable.harga_burung_hantu_celepuk));

        hantus.add(new Hantu(ctx.getString(R.string.snowy_owl),ctx.getString(R.string.snowy_asal),
                ctx.getString(R.string.snowy_deskripsi),R.drawable.snowy_owl_by_cycoze));

        hantus.add(new Hantu(ctx.getString(R.string.eruasia),ctx.getString(R.string.eruasia_asal),
                ctx.getString(R.string.eruasia_deskripsi),R.drawable.eurasian_eagle_owl_pat_eisenberger));

        return hantus;
    }

    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();

        ulars.add(new Ular(ctx.getString(R.string.king_kobra),ctx.getString(R.string.king_asal),
                ctx.getString(R.string.king_deskripsi),R.drawable.kobra));

        ulars.add(new Ular(ctx.getString(R.string.piton),ctx.getString(R.string.piton_asal),
                ctx.getString(R.string.piton_asal),R.drawable.piton));

        ulars.add(new Ular(ctx.getString(R.string.ular_hijau),ctx.getString(R.string.ular_asal),
                ctx.getString(R.string.ular_deskripsi),R.drawable.ular_hijau));

        return ulars;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataHantu(ctx));
        hewans.addAll(initDataUlar(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
