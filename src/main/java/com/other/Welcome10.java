
package com.other;

public class Welcome10 {
    private long wordRank;
    private String headWord;
    private Welcome10Content content;
    private String bookID;

    public long getWordRank() { return wordRank; }
    public void setWordRank(long value) { this.wordRank = value; }

    public String getHeadWord() { return headWord; }
    public void setHeadWord(String value) { this.headWord = value; }

    public Welcome10Content getContent() { return content; }
    public void setContent(Welcome10Content value) { this.content = value; }

    public String getBookID() { return bookID; }
    public void setBookID(String value) { this.bookID = value; }




    public  static class Welcome10Content {
        private ContentWord word;

        public ContentWord getWord() { return word; }
        public void setWord(ContentWord value) { this.word = value; }
    }

// ContentWord.java



    public static class ContentWord {
        private String wordHead;
        private String wordID;
        private WordContent content;

        public String getWordHead() { return wordHead; }
        public void setWordHead(String value) { this.wordHead = value; }

        public String getWordID() { return wordID; }
        public void setWordID(String value) { this.wordID = value; }

        public WordContent getContent() { return content; }
        public void setContent(WordContent value) { this.content = value; }
    }

// WordContent.java



    public static class WordContent {
        private ContentSentence sentence;
        private RealExamSentence realExamSentence;
        private String usphone;
        private String ukspeech;
        private long star;
        private String usspeech;
        private ContentSyno syno;
        private String ukphone;
        private ContentPhrase phrase;
        private String phone;
        private String speech;
        private RelWord relWord;
        private Tran[] trans;

        public ContentSentence getSentence() { return sentence; }
        public void setSentence(ContentSentence value) { this.sentence = value; }

        public RealExamSentence getRealExamSentence() { return realExamSentence; }
        public void setRealExamSentence(RealExamSentence value) { this.realExamSentence = value; }

        public String getUsphone() { return usphone; }
        public void setUsphone(String value) { this.usphone = value; }

        public String getUkspeech() { return ukspeech; }
        public void setUkspeech(String value) { this.ukspeech = value; }

        public long getStar() { return star; }
        public void setStar(long value) { this.star = value; }

        public String getUsspeech() { return usspeech; }
        public void setUsspeech(String value) { this.usspeech = value; }

        public ContentSyno getSyno() { return syno; }
        public void setSyno(ContentSyno value) { this.syno = value; }

        public String getUkphone() { return ukphone; }
        public void setUkphone(String value) { this.ukphone = value; }

        public ContentPhrase getPhrase() { return phrase; }
        public void setPhrase(ContentPhrase value) { this.phrase = value; }

        public String getPhone() { return phone; }
        public void setPhone(String value) { this.phone = value; }

        public String getSpeech() { return speech; }
        public void setSpeech(String value) { this.speech = value; }

        public RelWord getRelWord() { return relWord; }
        public void setRelWord(RelWord value) { this.relWord = value; }

        public Tran[] getTrans() { return trans; }
        public void setTrans(Tran[] value) { this.trans = value; }
    }

// ContentPhrase.java



    public static class ContentPhrase {
        private PhraseElement[] phrases;
        private String desc;

        public PhraseElement[] getPhrases() { return phrases; }
        public void setPhrases(PhraseElement[] value) { this.phrases = value; }

        public String getDesc() { return desc; }
        public void setDesc(String value) { this.desc = value; }
    }

// PhraseElement.java



    public static class PhraseElement {
        private String pContent;
        private String pCN;

        public String getPContent() { return pContent; }
        public void setPContent(String value) { this.pContent = value; }

        public String getPCN() { return pCN; }
        public void setPCN(String value) { this.pCN = value; }
    }

// RealExamSentence.java



    public static class RealExamSentence {
        private RealExamSentenceSentence[] sentences;
        private String desc;

        public RealExamSentenceSentence[] getSentences() { return sentences; }
        public void setSentences(RealExamSentenceSentence[] value) { this.sentences = value; }

        public String getDesc() { return desc; }
        public void setDesc(String value) { this.desc = value; }
    }

// RealExamSentenceSentence.java



    public static class RealExamSentenceSentence {
        private String sContent;
        private SourceInfo sourceInfo;

        public String getSContent() { return sContent; }
        public void setSContent(String value) { this.sContent = value; }

        public SourceInfo getSourceInfo() { return sourceInfo; }
        public void setSourceInfo(SourceInfo value) { this.sourceInfo = value; }
    }

// SourceInfo.java



    public static class SourceInfo {
        private String paper;
        private String level;
        private String year;
        private String type;

        public String getPaper() { return paper; }
        public void setPaper(String value) { this.paper = value; }

        public String getLevel() { return level; }
        public void setLevel(String value) { this.level = value; }

        public String getYear() { return year; }
        public void setYear(String value) { this.year = value; }

        public String getType() { return type; }
        public void setType(String value) { this.type = value; }
    }

// RelWord.java



    public static class RelWord {
        private Rel[] rels;
        private String desc;

        public Rel[] getRels() { return rels; }
        public void setRels(Rel[] value) { this.rels = value; }

        public String getDesc() { return desc; }
        public void setDesc(String value) { this.desc = value; }
    }

// Rel.java



    public static class Rel {
        private String pos;
        private WordElement[] words;

        public String getPos() { return pos; }
        public void setPos(String value) { this.pos = value; }

        public WordElement[] getWords() { return words; }
        public void setWords(WordElement[] value) { this.words = value; }
    }

// WordElement.java



    public static class WordElement {
        private String hwd;
        private String tran;

        public String getHwd() { return hwd; }
        public void setHwd(String value) { this.hwd = value; }

        public String getTran() { return tran; }
        public void setTran(String value) { this.tran = value; }
    }

// ContentSentence.java



    public static class ContentSentence {
        private SentenceSentence[] sentences;
        private String desc;

        public SentenceSentence[] getSentences() { return sentences; }
        public void setSentences(SentenceSentence[] value) { this.sentences = value; }

        public String getDesc() { return desc; }
        public void setDesc(String value) { this.desc = value; }
    }

// SentenceSentence.java



    public static class SentenceSentence {
        private String sContent;
        private String sCN;

        public String getSContent() { return sContent; }
        public void setSContent(String value) { this.sContent = value; }

        public String getSCN() { return sCN; }
        public void setSCN(String value) { this.sCN = value; }
    }

// ContentSyno.java



    public static class ContentSyno {
        private SynoElement[] synos;
        private String desc;

        public SynoElement[] getSynos() { return synos; }
        public void setSynos(SynoElement[] value) { this.synos = value; }

        public String getDesc() { return desc; }
        public void setDesc(String value) { this.desc = value; }
    }

// SynoElement.java



    public static class SynoElement {
        private String pos;
        private String tran;
        private Hwd[] hwds;

        public String getPos() { return pos; }
        public void setPos(String value) { this.pos = value; }

        public String getTran() { return tran; }
        public void setTran(String value) { this.tran = value; }

        public Hwd[] getHwds() { return hwds; }
        public void setHwds(Hwd[] value) { this.hwds = value; }
    }

// Hwd.java



    public static class Hwd {
        private String w;

        public String getW() { return w; }
        public void setW(String value) { this.w = value; }
    }

// Tran.java



    public static class Tran {
        private String tranCN;
        private String descOther;
        private String descCN;
        private String pos;
        private String tranOther;

        public String getTranCN() { return tranCN; }
        public void setTranCN(String value) { this.tranCN = value; }

        public String getDescOther() { return descOther; }
        public void setDescOther(String value) { this.descOther = value; }

        public String getDescCN() { return descCN; }
        public void setDescCN(String value) { this.descCN = value; }

        public String getPos() { return pos; }
        public void setPos(String value) { this.pos = value; }

        public String getTranOther() { return tranOther; }
        public void setTranOther(String value) { this.tranOther = value; }
    }
}


