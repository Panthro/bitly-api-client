/*
 * Copyright (c) Patrick Huber (gmail: stackmagic)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.swisstech.bitly.model.v3;

import java.util.List;

public class LinkReferringDomains {

	public long tz_offset;

	public String unit;

	public long units;

	public List<ReferringDomain> referring_domains;

	public static class ReferringDomain {

		public long clicks;

		public String domain;

		public String url;

		@Override
		public String toString() {
			return String.format("ReferringDomain { clicks=%d domain=%s url=%s }", clicks, domain, url);
		}
	}

	@Override
	public String toString() {
		return String
				.format("LinkReferringDomains { tz_offset=%d unit=%s units=%d referring_domains=%s }", tz_offset, unit, units, referring_domains);
	}
}