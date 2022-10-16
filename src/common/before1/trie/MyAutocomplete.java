package common.before1.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MyAutocomplete {

    static class TrieNode{
        char data;
        HashMap<Character, TrieNode> children= new HashMap<>();

        boolean isWord=false;
        public   TrieNode(char c){
            data=c;
        }
    }

    static  class Trie{
        TrieNode root = new TrieNode(' ');

        void insert(String s){
            TrieNode current= root;
            for(char ch : s.toCharArray()){
                // we create a new path
                if(!current.children.containsKey(ch)){
                    current.children.put(ch, new TrieNode(ch));
                    current.data=ch;
                }
                current= current.children.get(ch);

            }
            // at this point we added all chars of the word
            current.isWord= true;
        }
        List<String> autocomplete(String prefix){
            TrieNode current= root;
            List<String> res= new LinkedList<>();
            for(char ch: prefix.toCharArray()){
                if(!current.children.containsKey(ch)){
                    return res;
                }
                current= current.children.get(ch);
            }
            // we are at the last node of the prefix now we start doing dfs (depth first search)
            backTrack(current, res, prefix.substring(0, prefix.length()-1));

            return res;

        }

        void backTrack(TrieNode current, List<String> res, String prefix){
            // stop condition
            if(current.isWord){
                res.add(prefix + current.data);
            }
            // recursive call
            // for all the key set
            for(char ch: current.children.keySet()){
                backTrack(current.children.get(ch), res, prefix+ current.data); // prefix + current.data to build
            }
        }
    }
/*

    static class TrieNode {
        char data;
        HashMap<Character, TrieNode> children = new HashMap<>();

        boolean isWord = false;

        public TrieNode(char c) {
            data = c;
        }
    }



    static class Trie {
        TrieNode root = new TrieNode(' ');

        void insert(String s) {
            TrieNode current = root;
            for (char ch : s.toCharArray()) {
                // we create a new path
                if (!current.children.containsKey(ch)) {
                    current.children.put(ch, new TrieNode(ch));
                    current.data = ch;
                }
                current = current.children.get(ch);

            }
            // at this point we added all chars of the word
            current.isWord = true;
        }


        List<String> autocomplete(String prefix) {
            TrieNode current = root;
            List<String> res = new LinkedList<>();
            for (char ch : prefix.toCharArray()) {
                if (!current.children.containsKey(ch)) {
                    return res;
                }
                current = current.children.get(ch);
            }
            // we are at the last node of the prefix now we start doing dfs (depth first search)
            backTrack(current, res, prefix.substring(0, prefix.length() - 1));

            return res;

        }

        void backTrack(TrieNode current, List<String> res, String prefix) {
            // stop condition
            if (current.isWord) {
                res.add(prefix + current.data);
            }
            // recursive call
            // for all the key set
            for (char ch : current.children.keySet()) {
                backTrack(current.children.get(ch), res, prefix + current.data); // prefix + current.data to build
            }
        }
    }
*/
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("amazon");
        t.insert("amazon prime");
        t.insert("amazing");
        t.insert("amazing spider man");
        t.insert("amazed");
        t.insert("apple");
        t.insert("application");
        t.insert("appWork");
        List<String> s = t.autocomplete("ama");
        s.stream().forEach(e-> { System.out.println(e);});

    }


}
