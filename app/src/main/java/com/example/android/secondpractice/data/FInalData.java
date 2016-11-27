
package com.example.android.secondpractice.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class FInalData implements Parcelable {

    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("next")
    @Expose
    private Integer next;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("batches")
    @Expose
    private Integer batches;
    @SerializedName("currentBatch")
    @Expose
    private Integer currentBatch;

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The next
     */
    public Integer getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    public void setNext(Integer next) {
        this.next = next;
    }

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The batches
     */
    public Integer getBatches() {
        return batches;
    }

    /**
     * 
     * @param batches
     *     The batches
     */
    public void setBatches(Integer batches) {
        this.batches = batches;
    }

    /**
     * 
     * @return
     *     The currentBatch
     */
    public Integer getCurrentBatch() {
        return currentBatch;
    }

    /**
     * 
     * @param currentBatch
     *     The currentBatch
     */
    public void setCurrentBatch(Integer currentBatch) {
        this.currentBatch = currentBatch;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.items);
        dest.writeValue(this.next);
        dest.writeValue(this.total);
        dest.writeValue(this.batches);
        dest.writeValue(this.currentBatch);
    }

    public FInalData() {
    }

    protected FInalData(Parcel in) {
        this.items = new ArrayList<Item>();
        in.readList(this.items, Item.class.getClassLoader());
        this.next = (Integer) in.readValue(Integer.class.getClassLoader());
        this.total = (Integer) in.readValue(Integer.class.getClassLoader());
        this.batches = (Integer) in.readValue(Integer.class.getClassLoader());
        this.currentBatch = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<FInalData> CREATOR = new Parcelable.Creator<FInalData>() {
        @Override
        public FInalData createFromParcel(Parcel source) {
            return new FInalData(source);
        }

        @Override
        public FInalData[] newArray(int size) {
            return new FInalData[size];
        }
    };
}
