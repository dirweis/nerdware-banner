package de.nerdware;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import lombok.SneakyThrows;

@Configuration
class BannerBean implements InitializingBean {
	@Override
	@SneakyThrows
	public void afterPropertiesSet() {
		long a=0,b=0,c=0,C=0,d=0,e=0,E=0,g=0,i=0,n=0,N=0,o=0,r=0,s=0,S=0,u=0,v=0,x=0,y=1048576,z=0;for(;x<322;++x,y=x<32?y:x<64?0:x<96?2684354560L:x<128?1577348465:x<160?319299821:x<192?1246208:x<224?16778246:x<256?1166395532:x<288?230754:0,v=x<64?v:x<96?10:x<128?163840:x<160?1024:x<192?1426071552:x<224?2852137120L:x<256?134878528:x<288?264704:0,a=x<128?a:x<160?8392704:x<192?32768:0,b=x<128?b:x<160?2149613568L:x<192?4194322:x<224?16384:x<256?541073408:x<288?16401:0,s=x<128?s:x<160?67239936:x<192?262472:x<224?2097160:x<256?2147483664L:x<288?4:0,g=x<128?g:x<160?536870912:x<192?2048:0,o=x<192?o:x<224?8389120:0,u=x<192?u:x<224?589824:0,c=x<224?c:x<256?33554432:x<288?128:0,r=x<256?r:x<288?1048576:0,e=x<256?e:x<288?4290772992L:x<320?2139097087:0,S=x<288?S:x<320?4096:0,i=x<288?i:x<320?8192:0,n=x<288?n:x<320?16384:0,C=x<288?C:x<320?32768:0,E=x<288?E:x<320?65536:0,z=x<288?z:x<320?3407872:0,N=x<288?N:x<320?524288:0,d=x<320?d:x<352?1:0)System.out.print((char)((x+1)%46!=0?(d&1<<x)!=0?62:(N&1<<x)!=0?48:(z&1<<x)!=0?50:(E&1<<x)!=0?101:(C&1<<x)!=0?99:(n&1<<x)!=0?110:(i&1<<x)!=0?105:(S&1<<x)!=0?83:(e&1<<x)!=0?61:(r&1<<x)!=0?60:(c&1<<x)!=0?44:(u&1<<x)!=0?86:(o&1<<x)!=0?40:(g&1<<x)!=0?96:(s&1<<x)!=0?47:(b&1<<x)!=0?92:(a&1<<x)!=0?39:(v&1<<x)!=0?124:(y&1<<x)!=0?95:32:10));
		System.out.println();
	}
}
