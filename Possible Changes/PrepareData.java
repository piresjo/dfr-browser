/*
 * Prepare dfr-browser data files from MALLET outputs.
 * An alternative to this script with more features can be found in the
 * export_browser_data function in this R package:
 * http://github.com/agoldst/dfrtopics
 * Usage:
 *    prepare-data check [<dir>]
 *        Check presence and format of data files in <dir> or PWD
 *    prepare-data info-stub [-o <file>]
 *        Write stub info.json to <file> or "info.json"
 *    prepare-data convert-citations ... [-o <file>] [--ids <ids>]
 *        Convert JSTOR DfR citations.tsv files ... into zipped metadata
 *        <file>: name of file to write ("meta.csv.zip" by default)
 *        <ids>: (optional) a file with one document ID per line. If
 *        supplied, these IDs are matched against the first column of the
 *        input metadata, and the output contains only matching documents
 *        (in the order given in <ids>).
 *    prepare-data convert-tw [-o <file>] <tw> --vocab <v> [--param <p>] [-n N]
 *        Write topic-word information to <file> or "tw.json"
 *        <tw>: CSV with topic-word matrix (headerless)
 *        <v>: vocabulary listing, one line per column of <tw>
 *        <p>: (optional) params.txt written by dfrtopics v0.2
 *            If this is missing, topic alpha values will be missing
 *        <n>: number of top words per topic (50 by default)
 *    prepare-data convert-keys [-o <file>] <keys>
 *        Write topic-word information to <file> or "tw.json"
 *        <keys>: CSV with topic,alpha,word,weight columns (from dfrtopics v0.1)
 *            or with topic,word,weight columns (from dfrtopics v0.2)
 *    prepare-data convert-dt [-o <file>] <dt>
 *        Write zipped document-topic information to <dt> or <dt.json.zip>
 *        <dt>: CSV with document-word weights (headerless).
 *            This ordinary matrix is converted to the required sparse format.
 *    prepare-data convert-state <state> [--tw <tw>] [--dt <dt>]
 *        Use the MALLET sampling state to write both topic words and document
 *        topics.
 *        <state>: gzipped file from mallet train-topics --output-state or
 *        dfrtopics::write_mallet_state
 *        <tw>: name of topic-word file to output ("tw.json" by default)
 *        <dt>: name of doc-topic file to output ("dt.json.zip" by default)
 *
 */

import java.util.regex;
import java.io.File;
// Need to install a library for JSON
import java.util.zip.ZipFile;
import java.util.zip.GZIPOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import DefaultDict;
import java.util.Path;

public class PrepareData {

	boolean containsFile(String[] directories, String file) {
		for (int i = 0; i < directories.length, i++) {
			if (directories[i].equals(file)) {
				return true;
			}
		}
		return false;
	}

	void checkFiles(String d) {
		

	}

	void infoStub(String out) {
		
	}

	void convertCitations(File fs, String matchfile, String out) {
		

	}

	void convertTW(String twf, String out, String vocabf, String paramf, int n) {
		
	}

	HashMap<String, HashMap<String, Integer>> transformTopicWeights(HashMap<String, Integer> weightsVocab, int n) {
		return null;
	}

	//Need to find the types of the parameters
	//For now, leave blank
	void writeTW(ArrayList<Double> alpha, , String out) {
		
	}

	void convertKeys(String keysf, String out) {
		
	}

	void convertDT(String dtf, String out) {
		
	}

	HashMap<String, ArrayList<Integer>> transformDT(ArrayList<Integer>[] dt) { }
		

	ArrayList<Double> keysOldStyleAlphas(File f) {
		
	}

	ArrayList<Map<String, ArrayList<E>>> keysOldStyleTW(file f) {
		
	}

	ArrayList<Double> keysNewStyleAlphas(File f) {
		
	}

	ArrayList<Map<String, ArrayList<E>>> keysNewStyleTW(file f) {
		
	}

	void writeDT(HashMap<String, String[]> dtj, String out) {

	}

	void convertState(String statef, String twout, String dtout, int n) {
		
	}

	void help() {
		System.out.println("FEED ME");
	}

	String[] keyArg(String[] args, String key) {
		
	}

	public static void main(String[] args) {
    	
}