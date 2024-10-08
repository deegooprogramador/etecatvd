<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit22ef851b53e25c8d26344ec0330ac908
{
    public static $prefixLengthsPsr4 = array (
        'A' => 
        array (
            'APP\\' => 4,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'APP\\' => 
        array (
            0 => __DIR__ . '/../..' . '/src',
        ),
    );

    public static $classMap = array (
        'Composer\\InstalledVersions' => __DIR__ . '/..' . '/composer/InstalledVersions.php',
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit22ef851b53e25c8d26344ec0330ac908::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit22ef851b53e25c8d26344ec0330ac908::$prefixDirsPsr4;
            $loader->classMap = ComposerStaticInit22ef851b53e25c8d26344ec0330ac908::$classMap;

        }, null, ClassLoader::class);
    }
}
