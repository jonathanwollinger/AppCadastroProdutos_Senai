package com.example.cadastroprodutos.database.contract;

import android.provider.BaseColumns;

import com.example.cadastroprodutos.database.entity.ProdutoEntity;

public final class ProdutoContract {

    public static final String criarTabela() {
        return "CREATE TABLE " + ProdutoEntity.TABLE_NAME + " (" +
                ProdutoEntity._ID + " INTEGER PRIMARY KEY," +
                ProdutoEntity.COLUMN_NAME_NOME + " TEXT," +
                ProdutoEntity.COLUMN_NAME_VALOR + " REAL)";
    }

    public static final String removerTabela() {
        return "DROP TABLE IF EXISTIS " + ProdutoEntity.TABLE_NAME;
    }
}
