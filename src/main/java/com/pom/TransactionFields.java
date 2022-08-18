package com.pom;

import lombok.Builder;
import lombok.Value;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sreej
 */
@Builder(setterPrefix = "set")
public class TransactionFields {




    public static RecordsItem builder(){
        return new RecordsItem();
    }

    public static class RecordsItem {
        private String value;



        private String key;
        private List<RecordsItem> records;

        public RecordsItem build() {

            return new RecordsItem();
        }

        public RecordsItem setRecords(List<RecordsItem> records) {
            this.records = records;
            return this;
        }

        public RecordsItem setValue(String value) {
            this.value = value;
            return this;
        }

        public RecordsItem setKey(String key) {
            this.key = key;
            return this;
        }

        public static class Action {
            private String ACTION;

            public Action setACTION(String ACTION) {
                this.ACTION = ACTION;
                return this;
            }
        }
    }

}



