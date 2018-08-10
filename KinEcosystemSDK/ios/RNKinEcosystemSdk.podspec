
Pod::Spec.new do |s|
  s.name         = "RNKinEcosystemSdk"
  s.version      = "1.0.0"
  s.summary      = "RNKinEcosystemSdk"
  s.description  = <<-DESC
                  RNKinEcosystemSdk
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNKinEcosystemSdk.git", :tag => "master" }
  s.source_files  = "RNKinEcosystemSdk/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  s.dependency "KinEcosystem", "0.4.9"

end

  