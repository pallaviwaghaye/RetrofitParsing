package com.retrofit.retrofit;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import com.google.gson.annotations.Expose;

/**
 * Created by Akruti on 19-02-2018.
 */

public class BookTest {

        @SerializedName("Business and Economics")
        private List<Object> businessAndEconomics = null;
        @SerializedName("Children and Young Adult")
        private List<Object> childrenAndYoungAdult = null;
        @SerializedName("Editor Corner")
        private List<Object> editorCorner = null;
        @SerializedName("Fiction")
        private List<Object> fiction = null;
        @SerializedName("Indian History")
        private List<Object> indianHistory = null;
        @SerializedName("Society And Social Science")
        private List<Object> societyAndSocialScience = null;
        @SerializedName("Travel Books")
        private List<Object> travelBooks = null;
        @SerializedName("Used Books")
        private List<Object> usedBooks = null;

        public List<Object> getBusinessAndEconomics() {
            return businessAndEconomics;
        }

        public void setBusinessAndEconomics(List<Object> businessAndEconomics) {
            this.businessAndEconomics = businessAndEconomics;
        }

        public List<Object> getChildrenAndYoungAdult() {
            return childrenAndYoungAdult;
        }

        public void setChildrenAndYoungAdult(List<Object> childrenAndYoungAdult) {
            this.childrenAndYoungAdult = childrenAndYoungAdult;
        }

        public List<Object> getEditorCorner() {
            return editorCorner;
        }

        public void setEditorCorner(List<Object> editorCorner) {
            this.editorCorner = editorCorner;
        }

        public List<Object> getFiction() {
            return fiction;
        }

        public void setFiction(List<Object> fiction) {
            this.fiction = fiction;
        }

        public List<Object> getIndianHistory() {
            return indianHistory;
        }

        public void setIndianHistory(List<Object> indianHistory) {
            this.indianHistory = indianHistory;
        }

        public List<Object> getSocietyAndSocialScience() {
            return societyAndSocialScience;
        }

        public void setSocietyAndSocialScience(List<Object> societyAndSocialScience) {
            this.societyAndSocialScience = societyAndSocialScience;
        }

        public List<Object> getTravelBooks() {
            return travelBooks;
        }

        public void setTravelBooks(List<Object> travelBooks) {
            this.travelBooks = travelBooks;
        }

        public List<Object> getUsedBooks() {
            return usedBooks;
        }

        public void setUsedBooks(List<Object> usedBooks) {
            this.usedBooks = usedBooks;
        }


}
