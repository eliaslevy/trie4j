/*
 * Copyright 2014 Takao Nakaguchi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trie4j;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.trie4j.doublearray.DoubleArrayWikipediaSerializeTest;
import org.trie4j.doublearray.MapDoubleArrayWikipediaSerializeTest;
import org.trie4j.doublearray.MapTailDoubleArrayWithConcatTailBuilderWikipediaSerializeTest;
import org.trie4j.doublearray.MapTailDoubleArrayWithSuffixTrieTailBuilderWikipediaSerializeTest;
import org.trie4j.doublearray.TailDoubleArrayWithConcatTailBuilderWikipediaSerializeTest;
import org.trie4j.doublearray.TailDoubleArrayWithSuffixTrieDenseIndexTailArrayBuilderWikipediaSerializeTest;
import org.trie4j.doublearray.TailDoubleArrayWithSuffixTrieTailBuilderWikipediaSerializeTest;
import org.trie4j.louds.ConstantTimeSelect0TailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.LongsTailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.MapTailLOUDSPPTrieWithConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.MapTailLOUDSPPTrieWithSBVConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.MapTailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest;
import org.trie4j.louds.MapTailLOUDSPPTrieWithSuffixTrieTailArrayWikipediaSerializeTest;
import org.trie4j.louds.MapTailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.MapTailLOUDSTrieWithSBVConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.MapTailLOUDSTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest;
import org.trie4j.louds.MapTailLOUDSTrieWithSuffixTrieTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSPPTrieWithConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSPPTrieWithSBVConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSPPTrieWithSuffixTrieTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSTrieWithSBVConcatTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSTrieWithSuffixTrieTailArrayWikipediaSerializeTest;
import org.trie4j.patricia.MapPatriciaTrieWikipediaSerializeTest;
import org.trie4j.patricia.MapTailPatriciaTrieWithConcatTailBuilderWikipediaSerializeTest;
import org.trie4j.patricia.MapTailPatriciaTrieWithSuffixTrieTailBuilderWikipediaSerializeTest;
import org.trie4j.patricia.PatriciaTrieWikipediaSerializeTest;
import org.trie4j.patricia.TailPatriciaTrieWithConcatTailBuilderRebuildTrieWikipediaSerializeTest;
import org.trie4j.patricia.TailPatriciaTrieWithConcatTailBuilderWikipediaSerializeTest;
import org.trie4j.patricia.TailPatriciaTrieWithSuffixTrieTailBuilderWikipediaSerializeTest;
import org.trie4j.setAndMap.HashSetWikipediaSerializeTest;
import org.trie4j.setAndMap.TreeSetWikipediaSerializeTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	HashSetWikipediaSerializeTest.class,
	TreeSetWikipediaSerializeTest.class,
	PatriciaTrieWikipediaSerializeTest.class,
	TailPatriciaTrieWithConcatTailBuilderWikipediaSerializeTest.class,
	TailPatriciaTrieWithConcatTailBuilderRebuildTrieWikipediaSerializeTest.class,
	TailPatriciaTrieWithSuffixTrieTailBuilderWikipediaSerializeTest.class,
	DoubleArrayWikipediaSerializeTest.class,
	TailDoubleArrayWithConcatTailBuilderWikipediaSerializeTest.class,
	TailDoubleArrayWithSuffixTrieTailBuilderWikipediaSerializeTest.class,
	TailDoubleArrayWithSuffixTrieDenseIndexTailArrayBuilderWikipediaSerializeTest.class,
	TailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest.class,
	ConstantTimeSelect0TailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest.class,
	LongsTailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest.class,
	TailLOUDSTrieWithSBVConcatTailArrayWikipediaSerializeTest.class,
	TailLOUDSTrieWithSuffixTrieTailArrayWikipediaSerializeTest.class,
	TailLOUDSTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
	TailLOUDSPPTrieWithConcatTailArrayWikipediaSerializeTest.class,
	TailLOUDSPPTrieWithSBVConcatTailArrayWikipediaSerializeTest.class,
	TailLOUDSPPTrieWithSuffixTrieTailArrayWikipediaSerializeTest.class,
	TailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
//*
	MapPatriciaTrieWikipediaSerializeTest.class,
	MapTailPatriciaTrieWithConcatTailBuilderWikipediaSerializeTest.class,
	MapTailPatriciaTrieWithSuffixTrieTailBuilderWikipediaSerializeTest.class,
	MapDoubleArrayWikipediaSerializeTest.class,
	MapTailDoubleArrayWithConcatTailBuilderWikipediaSerializeTest.class,
	MapTailDoubleArrayWithSuffixTrieTailBuilderWikipediaSerializeTest.class,
	MapTailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest.class,
	MapTailLOUDSTrieWithSBVConcatTailArrayWikipediaSerializeTest.class,
	MapTailLOUDSTrieWithSuffixTrieTailArrayWikipediaSerializeTest.class,
	MapTailLOUDSTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
	MapTailLOUDSPPTrieWithConcatTailArrayWikipediaSerializeTest.class,
	MapTailLOUDSPPTrieWithSBVConcatTailArrayWikipediaSerializeTest.class,
	MapTailLOUDSPPTrieWithSuffixTrieTailArrayWikipediaSerializeTest.class,
	MapTailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
//*/
})
public class AllWikipediaSerializeTests {
}
