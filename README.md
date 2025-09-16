### 当前环境参数

- 操作系统: macOS 14.6 (darwin 24.6.0)
- JDK: 17.0.7
- Gradle Wrapper: 8.11.1
- Android Gradle Plugin (AGP): 8.9.1
- Kotlin: 2.0.0
- NDK: 27.1.12297006
- CMake: 3.22.1
- compileSdk: 34
- targetSdk: 34
- minSdk: 26
- 设备: OnePlus 9 Pro (Android 13)
- 备注: 已临时注释 OLLVM 自定义编译参数（见 `app/src/main/cpp/CMakeLists.txt` 中 `-mllvm -sub/-bcf/-sobf`），后续修复可去掉注释恢复。

# AndroidExample

安卓逆向相关文章中的示例代码。

### 当前功能（按首页 Tab 分类）

- 安全
  - 反调试检测（AntiDebugActivity）
  - SIGTRAP 反调试（Toast 检测）
  - Hook（SoHookerActivity）
  - Root（RootActivity）
  - 设备指纹（DeviceFingerprintActivity）

- Native
  - JNI 示例（JNIExampleActivity）
  - 汇编（AssemblyActivity）
  - 系统调用 syscall（SyscallActivity）
  - OLLVM 示例（OLLVMActivity）
  - VMP 示例（VMPActivity）
  - Unicorn（UnicornActivity）
  - Unidbg（UnidbgActivity）
  - Frida 反汇编（FridaDisassembleActivity）

- 加密
  - AES（Native + Java，模式：CBC/ECB/CTR）（AESActivity）
  - Base64（Base64Activity）
  - CRC32（CRC32Activity）
  - MD5（MD5Activity）
  - SHA1（SHA1Activity）
  - HMAC（HMACActivity）

- 网络/动态分析
  - OkHttp（OkHttpActivity）
  - Retrofit（RetrofitActivity）
  - 反抓包（AntiSniffActivity）
  - 动态篡改 so 函数返回值（SoHookerActivity）
  - so 脱壳（SoUnpackActivity）
  - FART（FartActivity）

文章索引：
- [JNI 方法真实执行流长啥样？IDA × Frida 自动化 Trace 一探究竟](https://cyrus-studio.github.io/blog/posts/jni-%E6%96%B9%E6%B3%95%E7%9C%9F%E5%AE%9E%E6%89%A7%E8%A1%8C%E6%B5%81%E9%95%BF%E5%95%A5%E6%A0%B7ida--frida-%E8%87%AA%E5%8A%A8%E5%8C%96-trace-%E4%B8%80%E6%8E%A2%E7%A9%B6%E7%AB%9F/)
- [手写 Android Dex VMP 壳：指令流 AES 加密 + 动态加载全流程](https://cyrus-studio.github.io/blog/posts/%E6%89%8B%E5%86%99-android-dex-vmp-%E5%A3%B3%E6%8C%87%E4%BB%A4%E6%B5%81-aes-%E5%8A%A0%E5%AF%86-+-%E5%8A%A8%E6%80%81%E5%8A%A0%E8%BD%BD%E5%85%A8%E6%B5%81%E7%A8%8B/)
- [手写 Android Dex VMP 壳：自定义虚拟机 + 指令解释执行全流程](https://cyrus-studio.github.io/blog/posts/%E6%89%8B%E5%86%99-android-dex-vmp-%E5%A3%B3%E8%87%AA%E5%AE%9A%E4%B9%89%E8%99%9A%E6%8B%9F%E6%9C%BA-+-%E6%8C%87%E4%BB%A4%E8%A7%A3%E9%87%8A%E6%89%A7%E8%A1%8C%E5%85%A8%E6%B5%81%E7%A8%8B/)
- [Frida Stalker Trace 实战：指令级跟踪与寄存器变化监控全解析](https://cyrus-studio.github.io/blog/posts/frida-stalker-trace-%E5%AE%9E%E6%88%98%E6%8C%87%E4%BB%A4%E7%BA%A7%E8%B7%9F%E8%B8%AA%E4%B8%8E%E5%AF%84%E5%AD%98%E5%99%A8%E5%8F%98%E5%8C%96%E7%9B%91%E6%8E%A7%E5%85%A8%E8%A7%A3%E6%9E%90/)
- [一文搞懂 Frida Stalker：对抗 OLLVM 的算法还原利器](https://cyrus-studio.github.io/blog/posts/%E4%B8%80%E6%96%87%E6%90%9E%E6%87%82-frida-stalker%E5%AF%B9%E6%8A%97-ollvm-%E7%9A%84%E7%AE%97%E6%B3%95%E8%BF%98%E5%8E%9F%E5%88%A9%E5%99%A8/)
- [Frida 实战：Android JNI 数组 (jobjectArray) 操作全流程解析](https://cyrus-studio.github.io/blog/posts/frida-%E5%AE%9E%E6%88%98android-jni-%E6%95%B0%E7%BB%84-jobjectarray-%E6%93%8D%E4%BD%9C%E5%85%A8%E6%B5%81%E7%A8%8B%E8%A7%A3%E6%9E%90/)
- [深入解析 AES 加密算法：原理、变体与 LibTomCrypt 在 Android 中的实战应用](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5%E8%A7%A3%E6%9E%90-aes-%E5%8A%A0%E5%AF%86%E7%AE%97%E6%B3%95%E5%8E%9F%E7%90%86%E5%8F%98%E4%BD%93%E4%B8%8E-libtomcrypt-%E5%9C%A8-android-%E4%B8%AD%E7%9A%84%E5%AE%9E%E6%88%98%E5%BA%94%E7%94%A8/)
- [用 Frida 控制 Android 线程：kill 命令、挂起与恢复全解析](https://cyrus-studio.github.io/blog/posts/%E7%94%A8-frida-%E6%8E%A7%E5%88%B6-android-%E7%BA%BF%E7%A8%8Bkill-%E5%91%BD%E4%BB%A4%E6%8C%82%E8%B5%B7%E4%B8%8E%E6%81%A2%E5%A4%8D%E5%85%A8%E8%A7%A3%E6%9E%90/)
- [利用 Linux 信号机制（SIGTRAP）实现 Android 下的反调试](https://cyrus-studio.github.io/blog/posts/%E5%88%A9%E7%94%A8-linux-%E4%BF%A1%E5%8F%B7%E6%9C%BA%E5%88%B6sigtrap%E5%AE%9E%E7%8E%B0-android-%E4%B8%8B%E7%9A%84%E5%8F%8D%E8%B0%83%E8%AF%95/)
- [Android 反调试攻防实战：多重检测手段解析与内核级绕过方案](https://cyrus-studio.github.io/blog/posts/android-%E5%8F%8D%E8%B0%83%E8%AF%95%E6%94%BB%E9%98%B2%E5%AE%9E%E6%88%98%E5%A4%9A%E9%87%8D%E6%A3%80%E6%B5%8B%E6%89%8B%E6%AE%B5%E8%A7%A3%E6%9E%90%E4%B8%8E%E5%86%85%E6%A0%B8%E7%BA%A7%E7%BB%95%E8%BF%87%E6%96%B9%E6%A1%88/)
- [如何防止 so 文件被轻松逆向？精准控制符号导出 + JNI 动态注册](https://cyrus-studio.github.io/blog/posts/%E5%A6%82%E4%BD%95%E9%98%B2%E6%AD%A2-so-%E6%96%87%E4%BB%B6%E8%A2%AB%E8%BD%BB%E6%9D%BE%E9%80%86%E5%90%91%E7%B2%BE%E5%87%86%E6%8E%A7%E5%88%B6%E7%AC%A6%E5%8F%B7%E5%AF%BC%E5%87%BA-+-jni-%E5%8A%A8%E6%80%81%E6%B3%A8%E5%86%8C/)
- [C&C++ 代码安全再升级：用 OLLVM 给 so 加上字符串加密保护](https://cyrus-studio.github.io/blog/posts/cc++-%E4%BB%A3%E7%A0%81%E5%AE%89%E5%85%A8%E5%86%8D%E5%8D%87%E7%BA%A7%E7%94%A8-ollvm-%E7%BB%99-so-%E5%8A%A0%E4%B8%8A%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%8A%A0%E5%AF%86%E4%BF%9D%E6%8A%A4/)
- [别让 so 裸奔！移植 OLLVM 到 NDK 并集成到 Android Studio](https://cyrus-studio.github.io/blog/posts/%E5%88%AB%E8%AE%A9-so-%E8%A3%B8%E5%A5%94%E7%A7%BB%E6%A4%8D-ollvm-%E5%88%B0-ndk-%E5%B9%B6%E9%9B%86%E6%88%90%E5%88%B0-android-studio/)
- [OLLVM 移植 LLVM18 踩坑：一步步调试修复控制流平坦化](https://cyrus-studio.github.io/blog/posts/ollvm-%E7%A7%BB%E6%A4%8D-llvm18-%E8%B8%A9%E5%9D%91%E4%B8%80%E6%AD%A5%E6%AD%A5%E8%B0%83%E8%AF%95%E4%BF%AE%E5%A4%8D%E6%8E%A7%E5%88%B6%E6%B5%81%E5%B9%B3%E5%9D%A6%E5%8C%96/)
- [OLLVM 移植 LLVM 18 实战，轻松实现 C&C++ 代码混淆](https://cyrus-studio.github.io/blog/posts/ollvm-%E7%A7%BB%E6%A4%8D-llvm-18-%E5%AE%9E%E6%88%98%E8%BD%BB%E6%9D%BE%E5%AE%9E%E7%8E%B0-cc++-%E4%BB%A3%E7%A0%81%E6%B7%B7%E6%B7%86/)
- [LLVM 全面解析：NDK 为什么离不开它？如何亲手编译调试 clang](https://cyrus-studio.github.io/blog/posts/llvm-%E5%85%A8%E9%9D%A2%E8%A7%A3%E6%9E%90ndk-%E4%B8%BA%E4%BB%80%E4%B9%88%E7%A6%BB%E4%B8%8D%E5%BC%80%E5%AE%83%E5%A6%82%E4%BD%95%E4%BA%B2%E6%89%8B%E7%BC%96%E8%AF%91%E8%B0%83%E8%AF%95-clang/)
- [LLVM 不止能编译！自定义 Pass + 定制 clang 实现函数名加密](https://cyrus-studio.github.io/blog/posts/llvm-%E4%B8%8D%E6%AD%A2%E8%83%BD%E7%BC%96%E8%AF%91%E8%87%AA%E5%AE%9A%E4%B9%89-pass-+-%E5%AE%9A%E5%88%B6-clang-%E5%AE%9E%E7%8E%B0%E5%87%BD%E6%95%B0%E5%90%8D%E5%8A%A0%E5%AF%86/)
- [静态分析神器 + 动态调试利器：IDA Pro × Frida 混合调试实战](https://cyrus-studio.github.io/blog/posts/%E9%9D%99%E6%80%81%E5%88%86%E6%9E%90%E7%A5%9E%E5%99%A8-+-%E5%8A%A8%E6%80%81%E8%B0%83%E8%AF%95%E5%88%A9%E5%99%A8ida-pro--frida-%E6%B7%B7%E5%90%88%E8%B0%83%E8%AF%95%E5%AE%9E%E6%88%98/)
- [攻防 FART 脱壳：实现 AJM 壳级别的对抗功能 + 绕过全解析](https://cyrus-studio.github.io/blog/posts/%E6%94%BB%E9%98%B2-fart-%E8%84%B1%E5%A3%B3%E5%AE%9E%E7%8E%B0-ajm-%E5%A3%B3%E7%BA%A7%E5%88%AB%E7%9A%84%E5%AF%B9%E6%8A%97%E5%8A%9F%E8%83%BD-+-%E7%BB%95%E8%BF%87%E5%85%A8%E8%A7%A3%E6%9E%90/)
- [静态分析根本不够！IDA Pro 动态调试 Android 应用的完整实战](https://cyrus-studio.github.io/blog/posts/%E9%9D%99%E6%80%81%E5%88%86%E6%9E%90%E6%A0%B9%E6%9C%AC%E4%B8%8D%E5%A4%9Fida-pro-%E5%8A%A8%E6%80%81%E8%B0%83%E8%AF%95-android-%E5%BA%94%E7%94%A8%E7%9A%84%E5%AE%8C%E6%95%B4%E5%AE%9E%E6%88%98/)
- [一文搞懂如何使用 Frida Hook Android App](https://cyrus-studio.github.io/blog/posts/%E4%B8%80%E6%96%87%E6%90%9E%E6%87%82%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-frida-hook-android-app/)
- [别再手工写 Hook 了！Python + Frida 一网打尽 SO 层动态注册 JNI 调用](https://cyrus-studio.github.io/blog/posts/%E5%88%AB%E5%86%8D%E6%89%8B%E5%B7%A5%E5%86%99-hook-%E4%BA%86python-+-frida-%E4%B8%80%E7%BD%91%E6%89%93%E5%B0%BD-so-%E5%B1%82%E5%8A%A8%E6%80%81%E6%B3%A8%E5%86%8C-jni-%E8%B0%83%E7%94%A8/)
- [如何实现 Android App 的抓包防护？又该如何绕过？一文看懂攻防博弈](https://cyrus-studio.github.io/blog/posts/%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0-android-app-%E7%9A%84%E6%8A%93%E5%8C%85%E9%98%B2%E6%8A%A4%E5%8F%88%E8%AF%A5%E5%A6%82%E4%BD%95%E7%BB%95%E8%BF%87%E4%B8%80%E6%96%87%E7%9C%8B%E6%87%82%E6%94%BB%E9%98%B2%E5%8D%9A%E5%BC%88/)
- [深入内核交互：用 strace 看清 Android 每一个系统调用](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5%E5%86%85%E6%A0%B8%E4%BA%A4%E4%BA%92%E7%94%A8-strace-%E7%9C%8B%E6%B8%85-android-%E6%AF%8F%E4%B8%80%E4%B8%AA%E7%B3%BB%E7%BB%9F%E8%B0%83%E7%94%A8/)
- [一文搞懂 SO 脱壳全流程：识别加壳、Frida Dump、原理深入解析](https://cyrus-studio.github.io/blog/posts/%E4%B8%80%E6%96%87%E6%90%9E%E6%87%82-so-%E8%84%B1%E5%A3%B3%E5%85%A8%E6%B5%81%E7%A8%8B%E8%AF%86%E5%88%AB%E5%8A%A0%E5%A3%B3frida-dump%E5%8E%9F%E7%90%86%E6%B7%B1%E5%85%A5%E8%A7%A3%E6%9E%90/)
- [用 Dex2C 把 Java 变 Native：Android 代码加固全攻略](https://cyrus-studio.github.io/blog/posts/%E7%94%A8-dex2c-%E6%8A%8A-java-%E5%8F%98-nativeandroid-%E4%BB%A3%E7%A0%81%E5%8A%A0%E5%9B%BA%E5%85%A8%E6%94%BB%E7%95%A5/)
- [FART 脱壳某大厂 App + CodeItem 修复 dex + 反编译还原源码](https://cyrus-studio.github.io/blog/posts/fart-%E8%84%B1%E5%A3%B3%E6%9F%90%E5%A4%A7%E5%8E%82-app-+-codeitem-%E4%BF%AE%E5%A4%8D-dex-+-%E5%8F%8D%E7%BC%96%E8%AF%91%E8%BF%98%E5%8E%9F%E6%BA%90%E7%A0%81/)
- [FART 脱壳不再全量！用一份配置文件精准控制节奏与范围](https://cyrus-studio.github.io/blog/posts/fart-%E8%84%B1%E5%A3%B3%E4%B8%8D%E5%86%8D%E5%85%A8%E9%87%8F%E7%94%A8%E4%B8%80%E4%BB%BD%E9%85%8D%E7%BD%AE%E6%96%87%E4%BB%B6%E7%B2%BE%E5%87%86%E6%8E%A7%E5%88%B6%E8%8A%82%E5%A5%8F%E4%B8%8E%E8%8C%83%E5%9B%B4/)
- [Frida + FART 联手：解锁更强大的 Android 脱壳新姿势](https://cyrus-studio.github.io/blog/posts/frida-+-fart-%E8%81%94%E6%89%8B%E8%A7%A3%E9%94%81%E6%9B%B4%E5%BC%BA%E5%A4%A7%E7%9A%84-android-%E8%84%B1%E5%A3%B3%E6%96%B0%E5%A7%BF%E5%8A%BF/)
- [FART 自动化脱壳框架优化实战：Bug 修复与代码改进记录](https://cyrus-studio.github.io/blog/posts/fart-%E8%87%AA%E5%8A%A8%E5%8C%96%E8%84%B1%E5%A3%B3%E6%A1%86%E6%9E%B6%E4%BC%98%E5%8C%96%E5%AE%9E%E6%88%98bug-%E4%BF%AE%E5%A4%8D%E4%B8%8E%E4%BB%A3%E7%A0%81%E6%94%B9%E8%BF%9B%E8%AE%B0%E5%BD%95/)
- [一步步带你移植 FART 到 Android 10，实现自动化脱壳](https://cyrus-studio.github.io/blog/posts/%E4%B8%80%E6%AD%A5%E6%AD%A5%E5%B8%A6%E4%BD%A0%E7%A7%BB%E6%A4%8D-fart-%E5%88%B0-android-10%E5%AE%9E%E7%8E%B0%E8%87%AA%E5%8A%A8%E5%8C%96%E8%84%B1%E5%A3%B3/)
- [干掉抽取壳！FART 自动化脱壳框架与 Execute 脱壳点解析](https://cyrus-studio.github.io/blog/posts/%E5%B9%B2%E6%8E%89%E6%8A%BD%E5%8F%96%E5%A3%B3fart-%E8%87%AA%E5%8A%A8%E5%8C%96%E8%84%B1%E5%A3%B3%E6%A1%86%E6%9E%B6%E4%B8%8E-execute-%E8%84%B1%E5%A3%B3%E7%82%B9%E8%A7%A3%E6%9E%90/)
- [FART 主动调用组件深度解析：破解 ART 下函数抽取壳的终极武器](https://cyrus-studio.github.io/blog/posts/fart-%E4%B8%BB%E5%8A%A8%E8%B0%83%E7%94%A8%E7%BB%84%E4%BB%B6%E6%B7%B1%E5%BA%A6%E8%A7%A3%E6%9E%90%E7%A0%B4%E8%A7%A3-art-%E4%B8%8B%E5%87%BD%E6%95%B0%E6%8A%BD%E5%8F%96%E5%A3%B3%E7%9A%84%E7%BB%88%E6%9E%81%E6%AD%A6%E5%99%A8/)
- [深入解析 dex2oat：vdex、cdex、dex 格式转换全流程实战](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5%E8%A7%A3%E6%9E%90-dex2oatvdexcdexdex-%E6%A0%BC%E5%BC%8F%E8%BD%AC%E6%8D%A2%E5%85%A8%E6%B5%81%E7%A8%8B%E5%AE%9E%E6%88%98/)
- [基于 Python + K-Means 的自动化视频分类实战](https://cyrus-studio.github.io/blog/posts/%E5%9F%BA%E4%BA%8E-python-+-k-means-%E7%9A%84%E8%87%AA%E5%8A%A8%E5%8C%96%E8%A7%86%E9%A2%91%E5%88%86%E7%B1%BB%E5%AE%9E%E6%88%98/)
- [Miniconda 全攻略：优雅管理你的 Python 环境](https://cyrus-studio.github.io/blog/posts/miniconda-%E5%85%A8%E6%94%BB%E7%95%A5%E4%BC%98%E9%9B%85%E7%AE%A1%E7%90%86%E4%BD%A0%E7%9A%84-python-%E7%8E%AF%E5%A2%83/)
- [使用 readelf 分析 so 文件：ELF 结构解析全攻略](https://cyrus-studio.github.io/blog/posts/%E4%BD%BF%E7%94%A8-readelf-%E5%88%86%E6%9E%90-so-%E6%96%87%E4%BB%B6elf-%E7%BB%93%E6%9E%84%E8%A7%A3%E6%9E%90%E5%85%A8%E6%94%BB%E7%95%A5/)
- [Frida Native 层 Hook 技巧：JNI 函数调用、字符串解析、so 加载](https://cyrus-studio.github.io/blog/posts/frida-native-%E5%B1%82-hook-%E6%8A%80%E5%B7%A7jni-%E5%87%BD%E6%95%B0%E8%B0%83%E7%94%A8%E5%AD%97%E7%AC%A6%E4%B8%B2%E8%A7%A3%E6%9E%90so-%E5%8A%A0%E8%BD%BD/)
- [ADB 远程调试全教程：弹不出授权弹窗？手动授权搞定！](https://cyrus-studio.github.io/blog/posts/adb-%E8%BF%9C%E7%A8%8B%E8%B0%83%E8%AF%95%E5%85%A8%E6%95%99%E7%A8%8B%E5%BC%B9%E4%B8%8D%E5%87%BA%E6%8E%88%E6%9D%83%E5%BC%B9%E7%AA%97%E6%89%8B%E5%8A%A8%E6%8E%88%E6%9D%83%E6%90%9E%E5%AE%9A/)
- [深入WSL与USB：教你如何编译 Linux 内核支持 USB 共享](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5wsl%E4%B8%8Eusb%E6%95%99%E4%BD%A0%E5%A6%82%E4%BD%95%E7%BC%96%E8%AF%91-linux-%E5%86%85%E6%A0%B8%E6%94%AF%E6%8C%81-usb-%E5%85%B1%E4%BA%AB/)
- [教你签自己的系统！LineageOS Release Key 签名刷机教程](https://cyrus-studio.github.io/blog/posts/%E6%95%99%E4%BD%A0%E7%AD%BE%E8%87%AA%E5%B7%B1%E7%9A%84%E7%B3%BB%E7%BB%9Flineageos-release-key-%E7%AD%BE%E5%90%8D%E5%88%B7%E6%9C%BA%E6%95%99%E7%A8%8B/)
- [刷入 LineageOS 后无法联网？一文解决IP配置失败与网络受限](https://cyrus-studio.github.io/blog/posts/%E5%88%B7%E5%85%A5-lineageos-%E5%90%8E%E6%97%A0%E6%B3%95%E8%81%94%E7%BD%91%E4%B8%80%E6%96%87%E8%A7%A3%E5%86%B3ip%E9%85%8D%E7%BD%AE%E5%A4%B1%E8%B4%A5%E4%B8%8E%E7%BD%91%E7%BB%9C%E5%8F%97%E9%99%90/)
- [手把手教你编译 LineageOS 模拟器镜像，并导入 Android Studio 使用！](https://cyrus-studio.github.io/blog/posts/%E6%89%8B%E6%8A%8A%E6%89%8B%E6%95%99%E4%BD%A0%E7%BC%96%E8%AF%91-lineageos-%E6%A8%A1%E6%8B%9F%E5%99%A8%E9%95%9C%E5%83%8F%E5%B9%B6%E5%AF%BC%E5%85%A5-android-studio-%E4%BD%BF%E7%94%A8/)
- [Android 源码如何导入 Android Studio？踩坑与解决方案详解](https://cyrus-studio.github.io/blog/posts/android-%E6%BA%90%E7%A0%81%E5%A6%82%E4%BD%95%E5%AF%BC%E5%85%A5-android-studio%E8%B8%A9%E5%9D%91%E4%B8%8E%E8%A7%A3%E5%86%B3%E6%96%B9%E6%A1%88%E8%AF%A6%E8%A7%A3/)
- [逆向某短视频App搜索协议：破解加密通信，还原真实数据！](https://cyrus-studio.github.io/blog/posts/%E9%80%86%E5%90%91%E6%9F%90%E7%9F%AD%E8%A7%86%E9%A2%91app%E6%90%9C%E7%B4%A2%E5%8D%8F%E8%AE%AE%E7%A0%B4%E8%A7%A3%E5%8A%A0%E5%AF%86%E9%80%9A%E4%BF%A1%E8%BF%98%E5%8E%9F%E7%9C%9F%E5%AE%9E%E6%95%B0%E6%8D%AE/)
- [动态篡改 so 函数返回值：一篇带你玩转 Android Hook 技术！](https://cyrus-studio.github.io/blog/posts/%E5%8A%A8%E6%80%81%E7%AF%A1%E6%94%B9-so-%E5%87%BD%E6%95%B0%E8%BF%94%E5%9B%9E%E5%80%BC%E4%B8%80%E7%AF%87%E5%B8%A6%E4%BD%A0%E7%8E%A9%E8%BD%AC-android-hook-%E6%8A%80%E6%9C%AF/)
- [OLLVM 混淆 + VMP 壳照样破！绕过加壳 SDK 的核心检测逻辑](https://cyrus-studio.github.io/blog/posts/ollvm-%E6%B7%B7%E6%B7%86-+-vmp-%E5%A3%B3%E7%85%A7%E6%A0%B7%E7%A0%B4%E7%BB%95%E8%BF%87%E5%8A%A0%E5%A3%B3-sdk-%E7%9A%84%E6%A0%B8%E5%BF%83%E6%A3%80%E6%B5%8B%E9%80%BB%E8%BE%91/)
- [逆向 JNI 函数找不到入口？动态注册定位技巧全解析](https://cyrus-studio.github.io/blog/posts/%E9%80%86%E5%90%91-jni-%E5%87%BD%E6%95%B0%E6%89%BE%E4%B8%8D%E5%88%B0%E5%85%A5%E5%8F%A3%E5%8A%A8%E6%80%81%E6%B3%A8%E5%86%8C%E5%AE%9A%E4%BD%8D%E6%8A%80%E5%B7%A7%E5%85%A8%E8%A7%A3%E6%9E%90/)
- [手把手教你改造 AAR：解包、注入逻辑、重打包，一条龙玩转第三方 SDK！](https://cyrus-studio.github.io/blog/posts/%E6%89%8B%E6%8A%8A%E6%89%8B%E6%95%99%E4%BD%A0%E6%94%B9%E9%80%A0-aar%E8%A7%A3%E5%8C%85%E6%B3%A8%E5%85%A5%E9%80%BB%E8%BE%91%E9%87%8D%E6%89%93%E5%8C%85%E4%B8%80%E6%9D%A1%E9%BE%99%E7%8E%A9%E8%BD%AC%E7%AC%AC%E4%B8%89%E6%96%B9-sdk/)
- [手把手教你玩转 MagiskBoot：内核解包打包全流程](https://cyrus-studio.github.io/blog/posts/%E6%89%8B%E6%8A%8A%E6%89%8B%E6%95%99%E4%BD%A0%E7%8E%A9%E8%BD%AC-magiskboot%E5%86%85%E6%A0%B8%E8%A7%A3%E5%8C%85%E6%89%93%E5%8C%85%E5%85%A8%E6%B5%81%E7%A8%8B/)
- [Magisk 修改 ro.debuggable 开启 Android 系统全局调试模式](https://cyrus-studio.github.io/blog/posts/magisk-%E4%BF%AE%E6%94%B9-rodebuggable-%E5%BC%80%E5%90%AF-android-%E7%B3%BB%E7%BB%9F%E5%85%A8%E5%B1%80%E8%B0%83%E8%AF%95%E6%A8%A1%E5%BC%8F/)
- [小米刷机全攻略：解锁BL、刷机、Root 一步到位](https://cyrus-studio.github.io/blog/posts/%E5%B0%8F%E7%B1%B3%E5%88%B7%E6%9C%BA%E5%85%A8%E6%94%BB%E7%95%A5%E8%A7%A3%E9%94%81bl%E5%88%B7%E6%9C%BAroot-%E4%B8%80%E6%AD%A5%E5%88%B0%E4%BD%8D/)
- [解决90%踩坑问题！LineageOS 源码下载与编译保姆级教程](https://cyrus-studio.github.io/blog/posts/%E8%A7%A3%E5%86%B390%E8%B8%A9%E5%9D%91%E9%97%AE%E9%A2%98lineageos-%E6%BA%90%E7%A0%81%E4%B8%8B%E8%BD%BD%E4%B8%8E%E7%BC%96%E8%AF%91%E4%BF%9D%E5%A7%86%E7%BA%A7%E6%95%99%E7%A8%8B/)
- [教你从零刷入 LineageOS：Recovery + Sideload 全流程实操指南](https://cyrus-studio.github.io/blog/posts/%E6%95%99%E4%BD%A0%E4%BB%8E%E9%9B%B6%E5%88%B7%E5%85%A5-lineageosrecovery-+-sideload-%E5%85%A8%E6%B5%81%E7%A8%8B%E5%AE%9E%E6%93%8D%E6%8C%87%E5%8D%97/)
- [搞懂 Android Hook 的两大核心：PLT Hook 与 Inline Hook 全解析](https://cyrus-studio.github.io/blog/posts/%E6%90%9E%E6%87%82-android-hook-%E7%9A%84%E4%B8%A4%E5%A4%A7%E6%A0%B8%E5%BF%83plt-hook-%E4%B8%8E-inline-hook-%E5%85%A8%E8%A7%A3%E6%9E%90/)
- [一键反编译、签名、安装 APK！手把手带你玩转 ApkTool + 签名工具](https://cyrus-studio.github.io/blog/posts/%E4%B8%80%E9%94%AE%E5%8F%8D%E7%BC%96%E8%AF%91%E7%AD%BE%E5%90%8D%E5%AE%89%E8%A3%85-apk%E6%89%8B%E6%8A%8A%E6%89%8B%E5%B8%A6%E4%BD%A0%E7%8E%A9%E8%BD%AC-apktool-+-%E7%AD%BE%E5%90%8D%E5%B7%A5%E5%85%B7/)
- [ADB 命令使用大全（建议收藏） Android 调试必备](https://cyrus-studio.github.io/blog/posts/adb-%E5%91%BD%E4%BB%A4%E4%BD%BF%E7%94%A8%E5%A4%A7%E5%85%A8%E5%BB%BA%E8%AE%AE%E6%94%B6%E8%97%8F-android-%E8%B0%83%E8%AF%95%E5%BF%85%E5%A4%87/)
- [深入理解 Android 热修复机制：掌握 dexElements 注入技巧](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5%E7%90%86%E8%A7%A3-android-%E7%83%AD%E4%BF%AE%E5%A4%8D%E6%9C%BA%E5%88%B6%E6%8E%8C%E6%8F%A1-dexelements-%E6%B3%A8%E5%85%A5%E6%8A%80%E5%B7%A7/)
- [深入剖析 Android 加壳应用运行流程与生命周期劫持方案](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5%E5%89%96%E6%9E%90-android-%E5%8A%A0%E5%A3%B3%E5%BA%94%E7%94%A8%E8%BF%90%E8%A1%8C%E6%B5%81%E7%A8%8B%E4%B8%8E%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F%E5%8A%AB%E6%8C%81%E6%96%B9%E6%A1%88/)
- [深入理解 Android ClassLoader 与双亲委派机制](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5%E7%90%86%E8%A7%A3-android-classloader-%E4%B8%8E%E5%8F%8C%E4%BA%B2%E5%A7%94%E6%B4%BE%E6%9C%BA%E5%88%B6/)
- [深入 ART Dex 加载流程，玩转 Android 通用脱壳点](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5-art-dex-%E5%8A%A0%E8%BD%BD%E6%B5%81%E7%A8%8B%E7%8E%A9%E8%BD%AC-android-%E9%80%9A%E7%94%A8%E8%84%B1%E5%A3%B3%E7%82%B9/)
- [打造自己的 Jar 文件分析工具：类名匹配 + 二进制搜索 + 日志输出全搞定](https://cyrus-studio.github.io/blog/posts/%E6%89%93%E9%80%A0%E8%87%AA%E5%B7%B1%E7%9A%84-jar-%E6%96%87%E4%BB%B6%E5%88%86%E6%9E%90%E5%B7%A5%E5%85%B7%E7%B1%BB%E5%90%8D%E5%8C%B9%E9%85%8D-+-%E4%BA%8C%E8%BF%9B%E5%88%B6%E6%90%9C%E7%B4%A2-+-%E6%97%A5%E5%BF%97%E8%BE%93%E5%87%BA%E5%85%A8%E6%90%9E%E5%AE%9A/)
- [一文搞懂 Smali 与 Baksmali：Java 层逆向必备技能](https://cyrus-studio.github.io/blog/posts/%E4%B8%80%E6%96%87%E6%90%9E%E6%87%82-smali-%E4%B8%8E-baksmalijava-%E5%B1%82%E9%80%86%E5%90%91%E5%BF%85%E5%A4%87%E6%8A%80%E8%83%BD/)
- [彻底搞懂 Retrofit：使用、封装与 Converter 原理](https://cyrus-studio.github.io/blog/posts/%E5%BD%BB%E5%BA%95%E6%90%9E%E6%87%82-retrofit%E4%BD%BF%E7%94%A8%E5%B0%81%E8%A3%85%E4%B8%8E-converter-%E5%8E%9F%E7%90%86/)
- [Unidbg Trace 实战：一步步还原 OLLVM 控制流平坦化算法](https://cyrus-studio.github.io/blog/posts/unidbg-trace-%E5%AE%9E%E6%88%98%E4%B8%80%E6%AD%A5%E6%AD%A5%E8%BF%98%E5%8E%9F-ollvm-%E6%8E%A7%E5%88%B6%E6%B5%81%E5%B9%B3%E5%9D%A6%E5%8C%96%E7%AE%97%E6%B3%95/)
- [unidbg 调试技巧全指南：掌握 Console Debugger 的正确姿势](https://cyrus-studio.github.io/blog/posts/unidbg-%E8%B0%83%E8%AF%95%E6%8A%80%E5%B7%A7%E5%85%A8%E6%8C%87%E5%8D%97%E6%8E%8C%E6%8F%A1-console-debugger-%E7%9A%84%E6%AD%A3%E7%A1%AE%E5%A7%BF%E5%8A%BF/)
- [unidbg 加载 so 并调用函数：dynarmic & unicorn、指针传参、寄存器读取](https://cyrus-studio.github.io/blog/posts/unidbg-%E5%8A%A0%E8%BD%BD-so-%E5%B9%B6%E8%B0%83%E7%94%A8%E5%87%BD%E6%95%B0dynarmic--unicorn%E6%8C%87%E9%92%88%E4%BC%A0%E5%8F%82%E5%AF%84%E5%AD%98%E5%99%A8%E8%AF%BB%E5%8F%96/)
- [如何用 unidbg 模拟 JNI 与 Java 交互？完整教程 + 源码实战](https://cyrus-studio.github.io/blog/posts/%E5%A6%82%E4%BD%95%E7%94%A8-unidbg-%E6%A8%A1%E6%8B%9F-jni-%E4%B8%8E-java-%E4%BA%A4%E4%BA%92%E5%AE%8C%E6%95%B4%E6%95%99%E7%A8%8B-+-%E6%BA%90%E7%A0%81%E5%AE%9E%E6%88%98/)
- [如何用 Unicorn 模拟器进行栈访问与 Patch 操作？](https://cyrus-studio.github.io/blog/posts/%E5%A6%82%E4%BD%95%E7%94%A8-unicorn-%E6%A8%A1%E6%8B%9F%E5%99%A8%E8%BF%9B%E8%A1%8C%E6%A0%88%E8%AE%BF%E9%97%AE%E4%B8%8E-patch-%E6%93%8D%E4%BD%9C/)
- [使用 Unicorn 执行 JNI 函数：so 反汇编 + 参数传递 + 结果读取](https://cyrus-studio.github.io/blog/posts/%E4%BD%BF%E7%94%A8-unicorn-%E6%89%A7%E8%A1%8C-jni-%E5%87%BD%E6%95%B0so-%E5%8F%8D%E6%B1%87%E7%BC%96-+-%E5%8F%82%E6%95%B0%E4%BC%A0%E9%80%92-+-%E7%BB%93%E6%9E%9C%E8%AF%BB%E5%8F%96/)
- [用 AndroidNativeEmu 实现 JNI 函数调用模拟](https://cyrus-studio.github.io/blog/posts/%E7%94%A8-androidnativeemu-%E5%AE%9E%E7%8E%B0-jni-%E5%87%BD%E6%95%B0%E8%B0%83%E7%94%A8%E6%A8%A1%E6%8B%9F/)
- [一文掌握 jnitrace：Frida 下分析 JNI 方法调用的利器](https://cyrus-studio.github.io/blog/posts/%E4%B8%80%E6%96%87%E6%8E%8C%E6%8F%A1-jnitracefrida-%E4%B8%8B%E5%88%86%E6%9E%90-jni-%E6%96%B9%E6%B3%95%E8%B0%83%E7%94%A8%E7%9A%84%E5%88%A9%E5%99%A8/)
- [Frida 玩转 JNI：方法地址追踪 + 指令反汇编 + Patch 注入](https://cyrus-studio.github.io/blog/posts/frida-%E7%8E%A9%E8%BD%AC-jni%E6%96%B9%E6%B3%95%E5%9C%B0%E5%9D%80%E8%BF%BD%E8%B8%AA-+-%E6%8C%87%E4%BB%A4%E5%8F%8D%E6%B1%87%E7%BC%96-+-patch-%E6%B3%A8%E5%85%A5/)
- [Unicorn Hook 机制全解析：指令、代码块、内存、系统调用](https://cyrus-studio.github.io/blog/posts/unicorn-hook-%E6%9C%BA%E5%88%B6%E5%85%A8%E8%A7%A3%E6%9E%90%E6%8C%87%E4%BB%A4%E4%BB%A3%E7%A0%81%E5%9D%97%E5%86%85%E5%AD%98%E7%B3%BB%E7%BB%9F%E8%B0%83%E7%94%A8/)
- [深入 Android syscall 实现：内联汇编系统调用 + NDK 汇编构建](https://cyrus-studio.github.io/blog/posts/%E6%B7%B1%E5%85%A5-android-syscall-%E5%AE%9E%E7%8E%B0%E5%86%85%E8%81%94%E6%B1%87%E7%BC%96%E7%B3%BB%E7%BB%9F%E8%B0%83%E7%94%A8-+-ndk-%E6%B1%87%E7%BC%96%E6%9E%84%E5%BB%BA/)
- [Android 下内联汇编开发指南：从基础语法到多架构适配全掌握](https://cyrus-studio.github.io/blog/posts/android-%E4%B8%8B%E5%86%85%E8%81%94%E6%B1%87%E7%BC%96%E5%BC%80%E5%8F%91%E6%8C%87%E5%8D%97%E4%BB%8E%E5%9F%BA%E7%A1%80%E8%AF%AD%E6%B3%95%E5%88%B0%E5%A4%9A%E6%9E%B6%E6%9E%84%E9%80%82%E9%85%8D%E5%85%A8%E6%8E%8C%E6%8F%A1/)
- [彻底搞懂 ARM 汇编中的条件标志：N、Z、C、V 有什么用？](https://cyrus-studio.github.io/blog/posts/%E5%BD%BB%E5%BA%95%E6%90%9E%E6%87%82-arm-%E6%B1%87%E7%BC%96%E4%B8%AD%E7%9A%84%E6%9D%A1%E4%BB%B6%E6%A0%87%E5%BF%97nzcv-%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8/)
- [搞懂 Thumb 汇编：指令集、编码方式与调试技巧全解析](https://cyrus-studio.github.io/blog/posts/%E6%90%9E%E6%87%82-thumb-%E6%B1%87%E7%BC%96%E6%8C%87%E4%BB%A4%E9%9B%86%E7%BC%96%E7%A0%81%E6%96%B9%E5%BC%8F%E4%B8%8E%E8%B0%83%E8%AF%95%E6%8A%80%E5%B7%A7%E5%85%A8%E8%A7%A3%E6%9E%90/)
- [ARM64 汇编实战指南：寻址方式 + 指令分类 + 编码原理全掌握](https://cyrus-studio.github.io/blog/posts/arm64-%E6%B1%87%E7%BC%96%E5%AE%9E%E6%88%98%E6%8C%87%E5%8D%97%E5%AF%BB%E5%9D%80%E6%96%B9%E5%BC%8F-+-%E6%8C%87%E4%BB%A4%E5%88%86%E7%B1%BB-+-%E7%BC%96%E7%A0%81%E5%8E%9F%E7%90%86%E5%85%A8%E6%8E%8C%E6%8F%A1/)
- [ARM64 可执行程序是如何诞生的？编译流程 + 指令调试全解析](https://cyrus-studio.github.io/blog/posts/arm64-%E5%8F%AF%E6%89%A7%E8%A1%8C%E7%A8%8B%E5%BA%8F%E6%98%AF%E5%A6%82%E4%BD%95%E8%AF%9E%E7%94%9F%E7%9A%84%E7%BC%96%E8%AF%91%E6%B5%81%E7%A8%8B-+-%E6%8C%87%E4%BB%A4%E8%B0%83%E8%AF%95%E5%85%A8%E8%A7%A3%E6%9E%90/)
- [Capstone + Keystone + Unicorn：逆向分析三件套全解](https://cyrus-studio.github.io/blog/posts/capstone-+-keystone-+-unicorn%E9%80%86%E5%90%91%E5%88%86%E6%9E%90%E4%B8%89%E4%BB%B6%E5%A5%97%E5%85%A8%E8%A7%A3/)
- [逆向还原变异 CRC32 算法：Unicorn + 汇编分析 + 模拟执行](https://cyrus-studio.github.io/blog/posts/%E9%80%86%E5%90%91%E8%BF%98%E5%8E%9F%E5%8F%98%E5%BC%82-crc32-%E7%AE%97%E6%B3%95unicorn-+-%E6%B1%87%E7%BC%96%E5%88%86%E6%9E%90-+-%E6%A8%A1%E6%8B%9F%E6%89%A7%E8%A1%8C/)
- [基于 Unicorn 实现轻量级 ARM64 模拟器：支持 Hook、Patch、寄存器监控等功能](https://cyrus-studio.github.io/blog/posts/%E5%9F%BA%E4%BA%8E-unicorn-%E5%AE%9E%E7%8E%B0%E8%BD%BB%E9%87%8F%E7%BA%A7-arm64-%E6%A8%A1%E6%8B%9F%E5%99%A8%E6%94%AF%E6%8C%81-hookpatch%E5%AF%84%E5%AD%98%E5%99%A8%E7%9B%91%E6%8E%A7%E7%AD%89%E5%8A%9F%E8%83%BD/)
- [如何魔改 CRC32 算法？从标准实现到加密扰动的变形逻辑解析](https://cyrus-studio.github.io/blog/posts/%E5%A6%82%E4%BD%95%E9%AD%94%E6%94%B9-crc32-%E7%AE%97%E6%B3%95%E4%BB%8E%E6%A0%87%E5%87%86%E5%AE%9E%E7%8E%B0%E5%88%B0%E5%8A%A0%E5%AF%86%E6%89%B0%E5%8A%A8%E7%9A%84%E5%8F%98%E5%BD%A2%E9%80%BB%E8%BE%91%E8%A7%A3%E6%9E%90/)
- [逆向还原魔改 Base64 算法：动态码表 + 汇编代码 + C 语言重构](https://cyrus-studio.github.io/blog/posts/%E9%80%86%E5%90%91%E8%BF%98%E5%8E%9F%E9%AD%94%E6%94%B9-base64-%E7%AE%97%E6%B3%95%E5%8A%A8%E6%80%81%E7%A0%81%E8%A1%A8-+-%E6%B1%87%E7%BC%96%E4%BB%A3%E7%A0%81-+-c-%E8%AF%AD%E8%A8%80%E9%87%8D%E6%9E%84/)
- [标准 Base64 太好逆？试试自定义码表 + 动态规则的魔改版本](https://cyrus-studio.github.io/blog/posts/%E6%A0%87%E5%87%86-base64-%E5%A4%AA%E5%A5%BD%E9%80%86%E8%AF%95%E8%AF%95%E8%87%AA%E5%AE%9A%E4%B9%89%E7%A0%81%E8%A1%A8-+-%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%99%E7%9A%84%E9%AD%94%E6%94%B9%E7%89%88%E6%9C%AC/)
- [一文搞懂常用加解密算法：编码、哈希、对称&非对称加密与压缩全解析](https://cyrus-studio.github.io/blog/posts/%E4%B8%80%E6%96%87%E6%90%9E%E6%87%82%E5%B8%B8%E7%94%A8%E5%8A%A0%E8%A7%A3%E5%AF%86%E7%AE%97%E6%B3%95%E7%BC%96%E7%A0%81%E5%93%88%E5%B8%8C%E5%AF%B9%E7%A7%B0%E9%9D%9E%E5%AF%B9%E7%A7%B0%E5%8A%A0%E5%AF%86%E4%B8%8E%E5%8E%8B%E7%BC%A9%E5%85%A8%E8%A7%A3%E6%9E%90/)
- [HMAC 加密算法是如何运作的？如何在 Android 上实现变体？](https://cyrus-studio.github.io/blog/posts/hmac-%E5%8A%A0%E5%AF%86%E7%AE%97%E6%B3%95%E6%98%AF%E5%A6%82%E4%BD%95%E8%BF%90%E4%BD%9C%E7%9A%84%E5%A6%82%E4%BD%95%E5%9C%A8-android-%E4%B8%8A%E5%AE%9E%E7%8E%B0%E5%8F%98%E4%BD%93/)
- [如何变形 SHA-1 算法？从标准实现到 Android 定制加密实践](https://cyrus-studio.github.io/blog/posts/%E5%A6%82%E4%BD%95%E5%8F%98%E5%BD%A2-sha-1-%E7%AE%97%E6%B3%95%E4%BB%8E%E6%A0%87%E5%87%86%E5%AE%9E%E7%8E%B0%E5%88%B0-android-%E5%AE%9A%E5%88%B6%E5%8A%A0%E5%AF%86%E5%AE%9E%E8%B7%B5/)
- [如何变形一个 MD5 算法？Android 实现 + OLLVM 防护实战解析](https://cyrus-studio.github.io/blog/posts/%E5%A6%82%E4%BD%95%E5%8F%98%E5%BD%A2%E4%B8%80%E4%B8%AA-md5-%E7%AE%97%E6%B3%95android-%E5%AE%9E%E7%8E%B0-+-ollvm-%E9%98%B2%E6%8A%A4%E5%AE%9E%E6%88%98%E8%A7%A3%E6%9E%90/)
- [全面解析 Android App 启动流程与事件循环机制底层原理](https://cyrus-studio.github.io/blog/posts/%E5%85%A8%E9%9D%A2%E8%A7%A3%E6%9E%90-android-app-%E5%90%AF%E5%8A%A8%E6%B5%81%E7%A8%8B%E4%B8%8E%E4%BA%8B%E4%BB%B6%E5%BE%AA%E7%8E%AF%E6%9C%BA%E5%88%B6%E5%BA%95%E5%B1%82%E5%8E%9F%E7%90%86/)
- [安卓抓包实战：使用 Charles 抓取 App 数据全流程详解](https://cyrus-studio.github.io/blog/posts/%E5%AE%89%E5%8D%93%E6%8A%93%E5%8C%85%E5%AE%9E%E6%88%98%E4%BD%BF%E7%94%A8-charles-%E6%8A%93%E5%8F%96-app-%E6%95%B0%E6%8D%AE%E5%85%A8%E6%B5%81%E7%A8%8B%E8%AF%A6%E8%A7%A3/)
- [全面解析 OkHttp 原理与实战：从拦截器机制到 Frida Hook 打印请求响应](https://cyrus-studio.github.io/blog/posts/%E5%85%A8%E9%9D%A2%E8%A7%A3%E6%9E%90-okhttp-%E5%8E%9F%E7%90%86%E4%B8%8E%E5%AE%9E%E6%88%98%E4%BB%8E%E6%8B%A6%E6%88%AA%E5%99%A8%E6%9C%BA%E5%88%B6%E5%88%B0-frida-hook-%E6%89%93%E5%8D%B0%E8%AF%B7%E6%B1%82%E5%93%8D%E5%BA%94/)
- [打造基于 ART 的 Android 函数抽取壳：原理剖析与完整源码实战](https://cyrus-studio.github.io/blog/posts/%E6%89%93%E9%80%A0%E5%9F%BA%E4%BA%8E-art-%E7%9A%84-android-%E5%87%BD%E6%95%B0%E6%8A%BD%E5%8F%96%E5%A3%B3%E5%8E%9F%E7%90%86%E5%89%96%E6%9E%90%E4%B8%8E%E5%AE%8C%E6%95%B4%E6%BA%90%E7%A0%81%E5%AE%9E%E6%88%98/)
- [手把手教你用 Chrome 断点调试 Frida 脚本，JS 调试不再是黑盒](https://cyrus-studio.github.io/blog/posts/%E6%89%8B%E6%8A%8A%E6%89%8B%E6%95%99%E4%BD%A0%E7%94%A8-chrome-%E6%96%AD%E7%82%B9%E8%B0%83%E8%AF%95-frida-%E8%84%9A%E6%9C%ACjs-%E8%B0%83%E8%AF%95%E4%B8%8D%E5%86%8D%E6%98%AF%E9%BB%91%E7%9B%92/)
- [逆向某物 App 登录接口：热修复逻辑挖掘隐藏参数、接口完整调用](https://cyrus-studio.github.io/blog/posts/%E9%80%86%E5%90%91%E6%9F%90%E7%89%A9-app-%E7%99%BB%E5%BD%95%E6%8E%A5%E5%8F%A3%E7%83%AD%E4%BF%AE%E5%A4%8D%E9%80%BB%E8%BE%91%E6%8C%96%E6%8E%98%E9%9A%90%E8%97%8F%E5%8F%82%E6%95%B0%E6%8E%A5%E5%8F%A3%E5%AE%8C%E6%95%B4%E8%B0%83%E7%94%A8/)
- [逆向某物 App 登录接口：还原 newSign 算法全流程](https://cyrus-studio.github.io/blog/posts/%E9%80%86%E5%90%91%E6%9F%90%E7%89%A9-app-%E7%99%BB%E5%BD%95%E6%8E%A5%E5%8F%A3%E8%BF%98%E5%8E%9F-newsign-%E7%AE%97%E6%B3%95%E5%85%A8%E6%B5%81%E7%A8%8B/)
- [逆向某物 App 登录接口：抓包分析 + Frida Hook 还原加密算法](https://cyrus-studio.github.io/blog/posts/%E9%80%86%E5%90%91%E6%9F%90%E7%89%A9-app-%E7%99%BB%E5%BD%95%E6%8E%A5%E5%8F%A3%E6%8A%93%E5%8C%85%E5%88%86%E6%9E%90-+-frida-hook-%E8%BF%98%E5%8E%9F%E5%8A%A0%E5%AF%86%E7%AE%97%E6%B3%95/)
- [破解 VMP+OLLVM 混淆：通过 Hook jstring 快速定位加密算法入口](https://cyrus-studio.github.io/blog/posts/%E7%A0%B4%E8%A7%A3-vmp+ollvm-%E6%B7%B7%E6%B7%86%E9%80%9A%E8%BF%87-hook-jstring-%E5%BF%AB%E9%80%9F%E5%AE%9A%E4%BD%8D%E5%8A%A0%E5%AF%86%E7%AE%97%E6%B3%95%E5%85%A5%E5%8F%A3/)


# [cyrus.jks](cyrus.jks)

keystore 文件：[cyrus.jks](cyrus.jks)

alias：cyrus_studio

store password：cyrus_studio

key password：cyrus_studio

# 公众号

公众号：CYRUS STUDIO

<img src="https://cyrus-studio.github.io/blog/gongzhonghao.jpg" width="240">
